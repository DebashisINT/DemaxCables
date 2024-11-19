package com.breezefielddemax.app.utils

import com.breezefielddemax.app.AppDatabase
import android.app.Activity
import android.app.Application
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.breezefielddemax.app.FTSApp
import com.breezefielddemax.app.domain.CrashReportEntity
import com.google.firebase.crashlytics.FirebaseCrashlytics
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.log

class CustomExceptionHandler(private val application: Application) : Thread.UncaughtExceptionHandler {

    private val defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()

    override fun uncaughtException(thread: Thread, throwable: Throwable) {
        // Capture crash details
        val timestamp = System.currentTimeMillis()
        val errorMessage = throwable.localizedMessage ?: "Unknown Error"
        val stackTrace = throwable.stackTraceToString()

        // Log the crash
        Log.e("Crash_report", "Crash occurred: $errorMessage")

        // Create and insert crash report into the database
        val crashReport = CrashReportEntity(timestamp = timestamp, errorMessage = errorMessage, stackTrace = stackTrace)
        CoroutineScope(Dispatchers.IO).launch {
            AppDatabase.getDBInstance()?.crashReportDao()?.insertCrashReport(crashReport)
        }

        // Log to Firebase Crashlytics
        FirebaseCrashlytics.getInstance().recordException(throwable)

        // Retrieve the current activity
        val currentActivity = FTSApp.getCurrentActivity()

        // Display crash dialog if there's a current activity
        if (currentActivity != null) {
            //Handler(Looper.getMainLooper()).post {
                Log.d("CustomExceptionHandler", "Crash handler triggered")
                Toast.makeText(currentActivity, "Crash occurred", Toast.LENGTH_SHORT).show()
                showCrashDialog(currentActivity, throwable)
          //  }

            /*// Delay termination to allow the user to see the dialog
            try {
                Thread.sleep(13000)  // 3 seconds delay
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }*/
        }else{
            Log.d("currentActivity","currentActivity is null")
        }
        try {
            Thread.sleep(15000)  // Adjust to allow time for the dialog to show
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        // Call the default handler for normal termination
        defaultExceptionHandler?.uncaughtException(thread, throwable)
    }

    private fun showCrashDialog(activity: Activity, throwable: Throwable) {
        Log.d("CrashDialog", "Attempting to show crash dialog")

        // Use a handler to post dialog creation on the main thread
        Handler(Looper.getMainLooper()).postDelayed({
            try {
                // Delay checking if activity is finishing
                if (!activity.isFinishing) {
                    AlertDialog.Builder(activity)
                        .setTitle("Application Error")
                        .setMessage("An unexpected error occurred:\n${throwable.localizedMessage}")
                        .setPositiveButton("OK") { dialog, _ ->
                            dialog.dismiss()
                            activity.finish() // Optionally finish the activity after the dialog
                        }
                        .show()
                }
            } catch (e: Exception) {
                Log.e("CrashDialog", "Error showing dialog: ${e.localizedMessage}")
            }
        }, 3000)  // You can adjust the delay time here as needed (e.g., 3 seconds)
    }

}


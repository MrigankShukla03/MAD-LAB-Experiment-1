package com.example.madlab.experiment2

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LifecycleActivity : AppCompatActivity() {
    
    private val TAG = "LifecycleActivity"
    private lateinit var logTextView: TextView
    private var logBuffer = StringBuilder()

    private fun updateLog(method: String, description: String) {
        val userInfo = "Name: Mrigank Shukla | USN: 25MCAR0109"
        val msg = "$userInfo\nMethod: $method()\nDesc: $description"
        Log.d(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        logBuffer.insert(0, "$msg\n--------------------\n")
        if (::logTextView.isInitialized) {
            logTextView.text = logBuffer.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        logTextView = findViewById(R.id.lifecycleLogTextView)
        updateLog("onCreate", "System is creating the Activity.")
    }

    override fun onStart() {
        super.onStart()
        updateLog("onStart", "Activity is becoming visible.")
    }

    override fun onResume() {
        super.onResume()
        updateLog("onResume", "Activity is now interactive (Foreground).")
    }

    override fun onPause() {
        super.onPause()
        updateLog("onPause", "Another activity takes focus (Partial Obscurity).")
    }

    override fun onStop() {
        super.onStop()
        updateLog("onStop", "Activity is no longer visible.")
    }

    override fun onRestart() {
        super.onRestart()
        updateLog("onRestart", "Activity is returning from background.")
    }

    override fun onDestroy() {
        super.onDestroy()
        updateLog("onDestroy", "Activity is being destroyed.")
    }
}

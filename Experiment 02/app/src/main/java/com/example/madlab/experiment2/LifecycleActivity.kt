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

    private fun updateLog(method: String) {
        val msg = "Lifecycle: $method executed"
        Log.d(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        logBuffer.append("$msg\n")
        if (::logTextView.isInitialized) {
            logTextView.text = logBuffer.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        logTextView = findViewById(R.id.lifecycleLogTextView)
        updateLog("onCreate")
    }

    override fun onStart() {
        super.onStart()
        updateLog("onStart")
    }

    override fun onResume() {
        super.onResume()
        updateLog("onResume")
    }

    override fun onPause() {
        super.onPause()
        updateLog("onPause")
    }

    override fun onStop() {
        super.onStop()
        updateLog("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        updateLog("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        updateLog("onDestroy")
    }
}

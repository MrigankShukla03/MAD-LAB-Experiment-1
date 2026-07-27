package com.example.madlab.experiment1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val contentTextView = findViewById<TextView>(R.id.dashboardContentTextView)
        
        // Test Case 3: System Status
        contentTextView.text = "Status: Deployment Successful\nPlatform: Android API 34\nDeveloper: AI Assistant\nModule: MAD Lab"
    }
}

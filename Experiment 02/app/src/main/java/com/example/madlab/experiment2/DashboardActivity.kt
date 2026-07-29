package com.example.madlab.experiment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val name = intent.getStringExtra("USER_NAME")
        val usn = intent.getStringExtra("USER_USN")
        
        findViewById<TextView>(R.id.welcomeTextView).text = "User: $name ($usn)"

        findViewById<Button>(R.id.btnHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        findViewById<Button>(R.id.btnLifecycle).setOnClickListener {
            startActivity(Intent(this, LifecycleActivity::class.java))
        }

        findViewById<Button>(R.id.btnAccount).setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
        }
    }
}

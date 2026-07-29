package com.example.madlab.experiment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nameEdit = findViewById<EditText>(R.id.nameEditText)
        val usnEdit = findViewById<EditText>(R.id.usnEditText)
        val loginBtn = findViewById<Button>(R.id.loginButton)

        loginBtn.setOnClickListener {
            val name = nameEdit.text.toString()
            val usn = usnEdit.text.toString()

            if (name.isNotEmpty() && usn.isNotEmpty()) {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("USER_NAME", name)
                intent.putExtra("USER_USN", usn)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter details", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

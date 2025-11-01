package com.example.shopsmart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
                val username = intent.getStringExtra("username")
                val Welcome = findViewById<TextView>(R.id.home)
                Welcome.text = "Welcome, $username!"

                val Home = findViewById<ImageView>(R.id.icon1)
                val Profile = findViewById<ImageView>(R.id.icon2)
                val Logout = findViewById<ImageView>(R.id.icon3)

                Home.setOnClickListener {
                    Toast.makeText(this, "You are already on Home", Toast.LENGTH_SHORT).show()
                }

                Profile.setOnClickListener {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                }

                Logout.setOnClickListener {
                    Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
    }

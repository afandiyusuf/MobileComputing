package com.example.afand.latihan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dbUser: String = ""
    var dbPass: String = ""
    var dbNPM: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout_login.visibility = View.VISIBLE

        login.setOnClickListener {
            
            var inputanUsername = username.text.toString()
            var inputanPassword = password.text.toString()

            if (dbUser == "" && dbUser == "") {
                Toast.makeText(applicationContext, "Failed Login", Toast.LENGTH_SHORT).show()
            } else if (inputanPassword == dbPass && inputanUsername == dbUser) {

            } else {
                Toast.makeText(applicationContext, "Failed Login", Toast.LENGTH_SHORT).show()
            }
        }

        register.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            // To pass any data to next activity
                        //intent.putExtra("keyIdentifier", value)
            // start your next activity
            startActivity(intent)
        }


    }
}

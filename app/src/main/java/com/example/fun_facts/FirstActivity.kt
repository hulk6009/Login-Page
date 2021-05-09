package com.example.fun_facts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()

    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val loginButton = findViewById<MaterialButton>(R.id.next_button)
        val cancelButton = findViewById<MaterialButton>(R.id.cancel_button)


        loginButton.setOnClickListener() {
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Email or Password is Not Provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.text.toString() == "kotlin@gmail.com" && password.text.toString() == "12345") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong Email or Password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

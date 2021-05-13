package com.example.zuritraining2ndproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.zuritraining2ndproject.databinding.ActivityLoginBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
     private var binding:ActivityLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signinButton = findViewById<MaterialButton>(R.id.next_button)
        signinButton.setOnClickListener{
            if(email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this,"Email or password is not provided",Toast.LENGTH_LONG).show()
            }else{
                if(email.text.toString() == "tim@gmail.com" && password.text.toString() == "123456") {
                    val intent= Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                }    else{
                        Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show() }

            }
        }
    }
}
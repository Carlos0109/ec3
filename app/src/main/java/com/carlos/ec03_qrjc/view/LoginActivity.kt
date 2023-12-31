package com.carlos.ec03_qrjc.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.carlos.ec03_qrjc.R
import com.carlos.ec03_qrjc.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
    }
    private fun setupViews() {
        binding.tilEmail.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validateInputs(text.toString(), binding.tilPassword.editText?.text.toString())
        }
        binding.tilPassword.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validateInputs(binding.tilEmail.editText?.text.toString(), text.toString())
        }
        binding.btnLogin.setOnClickListener {
            if (validateInputs(binding.tilEmail.editText?.text.toString(), binding.tilPassword.editText?.text.toString())) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun validateInputs(email: String, password: String): Boolean {
        return email == "admin" && password == "123"
    }
}
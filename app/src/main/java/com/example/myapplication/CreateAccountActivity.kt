package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityCreateaccountBinding
import com.example.myapplication.databinding.ActivityMainBinding

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateaccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateaccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtCadastrar.setOnClickListener(){
            val cadastrar = Intent(this,LoginActivity::class.java)
            startActivity(cadastrar)
        }
    }
}
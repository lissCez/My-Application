package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityCreateaccountBinding
import com.example.myapplication.databinding.ActivityLocate2Binding
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtEditar2.setOnClickListener(){
            val Editar = Intent(this,CreateAccountActivity::class.java)
            startActivity(Editar)
        }
    }
}
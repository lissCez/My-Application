package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLocate1Binding
import com.example.myapplication.databinding.ActivityLocate2Binding

class LocateActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityLocate2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocate2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtMenu.setOnClickListener(){
            val EntrarMenu2 = Intent(this,MenuActivity::class.java)
            startActivity(EntrarMenu2)
        }
    }
}
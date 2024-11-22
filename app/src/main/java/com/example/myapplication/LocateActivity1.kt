package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLocate1Binding
import com.example.myapplication.databinding.ActivityMainBinding

class LocateActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityLocate1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocate1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtMenu.setOnClickListener(){
            val EntrarMenu = Intent(this,MenuActivity::class.java)
            startActivity(EntrarMenu)
        }
    }
}
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLocate1Binding
import com.example.myapplication.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Perfil.setOnClickListener(){
            val EntrarPerfil = Intent(this,ProfileActivity::class.java)
            startActivity(EntrarPerfil)
        }
        binding.Alugar.setOnClickListener(){
            val EntrarAlugar = Intent(this,LocateActivity1::class.java)
            startActivity(EntrarAlugar)
        }
        binding.BtSair2.setOnClickListener(){
            val Sair = Intent(this,LocateActivity2::class.java)
            startActivity(Sair)
        }
    }
}
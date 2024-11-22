package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtEntrar4.setOnClickListener {
            val entrar2 = Intent(this,LocateActivity1::class.java)
            startActivity(entrar2)
        }

        binding.BtCadastrar1.setOnClickListener(){
            val cadastrar1 = Intent(this,CreateAccountActivity::class.java)
            startActivity(cadastrar1)
        }
    }
}
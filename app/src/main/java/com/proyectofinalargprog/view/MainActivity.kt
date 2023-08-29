package com.proyectofinalargprog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.proyectofinalargprog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // val boton = findViewById<AppCompatButton>(R.id.boton)
        //val texto1 = findViewById<AppCompatEditText>(R.id.texto1)
        //val texto2 = findViewById<AppCompatEditText>(R.id.texto2)

       // boton.setOnClickListener {   }

    }
}
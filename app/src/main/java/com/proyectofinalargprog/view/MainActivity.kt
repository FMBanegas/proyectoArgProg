package com.proyectofinalargprog.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.proyectofinalargprog.databinding.ActivityMainBinding
import com.proyectofinalargprog.viewmodel.VistaModelo

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val vistaModelo: VistaModelo by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        vistaModelo.compare.observe(this) {
            // println("recibimos un nuevo valor de compare $it ")
            binding.resultado.text = "${if (it.resul) "asd" else "falseee"}"
        }
        binding.boton.setOnClickListener {
            vistaModelo.comparar()
        }




       // val boton = findViewById<AppCompatButton>(R.id.boton)
        //val texto1 = findViewById<AppCompatEditText>(R.id.texto1)
        //val texto2 = findViewById<AppCompatEditText>(R.id.texto2)

       // boton.setOnClickListener {   }

    }
}
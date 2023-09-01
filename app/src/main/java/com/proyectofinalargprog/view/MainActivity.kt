package com.proyectofinalargprog.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.proyectofinalargprog.databinding.ActivityMainBinding
import com.proyectofinalargprog.viewmodel.VistaModelo
import android.util.Log
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val vistaModelo: VistaModelo by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        vistaModelo.compare.observe(this) {
            binding.resultado.text = "${it.resul}"
        }
        binding.boton.setOnClickListener {



            vistaModelo.comparar(binding.texto1.text.toString(), binding.texto2.text.toString())
        }






    }
}
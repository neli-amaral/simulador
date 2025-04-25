package com.annelise.simulador

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.annelise.simulador.databinding.ActivityMainBinding
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var item:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        item = binding.spinnerGenero

        val genero = listOf("Masculino", "Feminino")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genero)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        binding.spinnerGenero.adapter = adapter

        binding.buttonCalc.setOnClickListener{
            val idade = binding.editTextIdade.text.toString().toLong()
            Toast.makeText(this,idade.toString(), Toast.LENGTH_SHORT).show()
        }
        binding


    }
}
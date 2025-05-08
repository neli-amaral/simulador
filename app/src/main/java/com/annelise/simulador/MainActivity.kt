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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val genero = listOf("Masculino", "Feminino")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, genero)

        binding.spinnerGenero.adapter = adapter

        binding.buttonCalc.setOnClickListener{
            val generoSelect = binding.spinnerGenero.selectedItem as String
            var idade = binding.editTextIdade.text.toString().toLongOrNull()
            var resultado:Long

            if(generoSelect.trim()=="Masculino"){

                resultado = 65 - idade!!
                if(idade >= 65){
                    resultado = 0
                }
                binding.textViewMsg.text= "Você já pode se aposentar"

            }else{
                resultado= 62 - idade!!
                if(idade >= 62){
                }
                binding.textViewMsg.text= "Você já pode se aposentar"
            }
            binding.textViewMsg.text= "Faltam $resultado anos para você se aposentar"
        }


    }
}
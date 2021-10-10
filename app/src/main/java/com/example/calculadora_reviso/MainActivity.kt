package com.example.calculadora_reviso


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity//
import android.os.Bundle//
import android.provider.AlarmClock.EXTRA_MESSAGE//
import android.view.LayoutInflater
//import android.view.LayoutInflater
import android.view.View

import com.example.calculadora_reviso.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener{ calculate() }
    }

    private fun calculate(view: View){
        val InsertEdit = binding.Insert
        val Insert2Edit = binding.Insert2
        val selectedid = binding.radio.checkedRadioButtonId

        //convertendo variaveis

        val N1 = InsertEdit.text.toString().toInt()
        val N2 = Insert2Edit.text.toString().toInt()

        val calculo = Calculadora().somar(N1 , N2).toString()
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, calculo)
        }
        startActivity(intent)
    }



    class Calculadora {
        fun somar(N1 : Int, N2 : Int) : Int
        {
            val result = N1 + N2
            return(result)
        }
    }














}
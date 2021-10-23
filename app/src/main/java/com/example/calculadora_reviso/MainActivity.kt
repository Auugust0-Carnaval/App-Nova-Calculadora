package com.example.calculadora_reviso

import androidx.appcompat.app.AppCompatActivity//
import android.os.Bundle//
import android.widget.Toast
import com.example.calculadora_reviso.databinding.ActivityMainBinding
import java.text.DecimalFormat

//faz a exibição do código
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculate.setOnClickListener{
            calculate()
            val toast = Toast.makeText(this, "Sucesso ao calcular", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

       fun calculate(){
          val InsertEdit = binding.Insert //edittext
          val Insert2Edit = binding.Insert2//editText
          val selectedid = binding.radio.checkedRadioButtonId//RadioButton selecionado

          //convertendo variaveis

          val N1 = InsertEdit.text.toString().toFloat() //conveti as variavies para float
          val N2 = Insert2Edit.text.toString().toFloat() //conveti as variavies para float

           //criei uma variavel com uma estrutura de decisao, se um radiobutton for selecionado executa
           //uma funçao, com os parametros das variaveis (N1 e N2)
           val tipcalculation = when (selectedid){
               R.id.add -> Calculadora().somar(N1, N2)
               R.id.multiply -> Calculadora().multiplicar(N1, N2)
               R.id.subtract -> Calculadora().menos(N1, N2)
               else -> Calculadora().divisao(N1, N2)
           }

           val tipResult = DecimalFormat().format(tipcalculation)
           binding.result.text = tipResult
      }
}
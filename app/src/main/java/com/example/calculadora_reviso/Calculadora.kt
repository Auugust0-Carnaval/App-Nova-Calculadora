package com.example.calculadora_reviso

class Calculadora {

    fun somar(N1 : Int, N2 : Int): Int{
        val result =  N1 + N2
        return(result)
    }

    fun menos(N1 : Int, N2 : Int): Int{
        val result = N1 - N2
        return(result)
    }

    fun multiplicar(N1 : Int, N2 : Int): Int
    {
        val result = N1 * N2
        return(result)
    }
    fun divisao(N1 : Int, N2 : Int): Int
    {
        val result = N1 / N2
        return(result)
    }
}
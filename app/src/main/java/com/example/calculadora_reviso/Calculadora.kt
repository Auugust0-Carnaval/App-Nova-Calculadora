package com.example.calculadora_reviso

//essa classe executa o calculo
class Calculadora {

    fun somar(N1 : Float, N2 : Float): Float{
        val result =  N1 + N2
        return(result)
    }

    fun menos(N1 : Float, N2 : Float): Float{
        val result = N1 - N2
        return(result)
    }

    fun multiplicar(N1 : Float, N2 : Float): Float{
        val result = N1 * N2
        return(result)
    }
    fun divisao(N1 : Float, N2 : Float): Float{
        val result = N1 / N2
        return(result)
    }
}
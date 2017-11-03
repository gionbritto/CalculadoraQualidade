package com.example.giovanne.calculadoraqualidade;

/**
 * Created by giovanne on 03/11/17.
 */
import junit.framework.TestCase;

import org.junit.Test;

public class CalculosTest extends TestCase{


    @Test
    public void testResultadoCalculoSoma(){
        int resultado = Calculos.soma(3,2);

        assertTrue(5==resultado);

            }

    @Test
    public void testResultadoDoCalculoSubtracao(){
        int resultado = Calculos.subtracao(9,2);

        assertEquals(5,resultado);
    }

    @Test
    public void testresultadoDoCalculoMultiplicacao(){
        //assert //arrenge
        int primeiroParamentro = 5,
            segundoParametro = 2,
            valorEsperado = 10;

        //excercise
        int resultado = Calculos.multi(primeiroParamentro, segundoParametro);

        //verify
        assertEquals("resultado da multiplicacao=",valorEsperado, resultado);
    }
}

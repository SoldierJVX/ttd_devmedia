package com.study;

import com.study.service.Calculadora;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTeste {

    @Test
    public void deveriaSomarDoisValoresPassados() throws Exception {
        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception {
        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.subtrair(valorA, valorB);

        assertEquals(-1, soma);
    }

    @Test
    public void deveriaDividirDoisValoresPassados() throws Exception {
        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.dividir(valorA, valorB);

        assertEquals(0, soma);
    }

    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
            throws Exception {
        int valorA = 6;
        int valorB = 0;

        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.dividir(valorA, valorB);

        assertEquals(0, divisao);
    }

    @Test
    public void deveriaMultiplicarDoisValoresPassados() throws Exception {
        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.multiplicar(valorA, valorB);

        assertEquals(2, soma);
    }
}

package com.calculadora;
public class MathFunctions {

    public static int factorialDeN(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero ; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static float mediaHastaN(int numero) {
        int resultado = 0;
        for (int i = 1; i <= numero ; i++) {
            resultado += i;
        }
        return (float) resultado/numero;
    }

    public static String obtenerPasosFibonacci(int numero) {
        
        int[] fibonacci = new int[numero];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
    
        
        for (int i = 2; i < numero; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
    
        
        String resultado = "";
        for (int i = 0; i < numero; i++) {
            resultado += fibonacci[i];
            if (i < numero -1) {
                resultado += ", ";
            }
        }
        return resultado;
    }
    
}





import java.util.Scanner;

import com.calculadora.MathFunctions;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un valor para realizar los cálculos");
        int n = sc.nextInt();

        System.out.println("Valor del factorialDeN: " + MathFunctions.factorialDeN(n));
        System.out.println("Valor de mediaHastaN: " + MathFunctions.mediaHastaN(n));
        System.out.println("Valor de obtenerPasosFibonacci: " + MathFunctions.obtenerPasosFibonacci(n));

        sc.close();
    }
}


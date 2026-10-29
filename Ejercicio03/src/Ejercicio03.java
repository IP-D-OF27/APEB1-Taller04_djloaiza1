
import java.util.Scanner;

/**
 * Ejercicio 01: "Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 *
 * @author Diego Loaiza
 * @version 1.0
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int valorBase, valorInicial;
        System.out.print("Deme un valor base entre el 2 y el 6: ");
        valorInicial = tcl.nextInt();
        valorBase = valorInicial;
        if (valorBase >= 2 && valorBase <= 6) {
            System.out.println(valorInicial);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            valorBase = (valorBase + valorInicial);
            System.out.println(valorBase);
            
        }
        else 
            System.out.println("Dije entre el 2 y el 6    >:(");

    }
}


/***
 * EVIDENCIA DEL RUN:
 Deme un valor base entre el 2 y el 6: 4
4
8
12
16
20
24
28
32
36
40
BUILD SUCCESSFUL (total time: 2 seconds)
 */

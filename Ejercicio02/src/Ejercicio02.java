
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia."
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int gastoHijo1, gastoHijo2, gastoHijo3, TotalGastos;
        System.out.println("Dar los tres gastos: ");
        gastoHijo1 = tcl.nextInt();
        gastoHijo2 = tcl.nextInt();
        gastoHijo3 = tcl.nextInt();
        TotalGastos = gastoHijo1 + gastoHijo2 +gastoHijo3;
        System.out.println("El total de gastos es de: " + TotalGastos);
        
    }
}

/***
 * EVIDENCIA DEL RUN:
Dar los tres gastos: 
2 3 4
El total de gastos es de: 9
BUILD SUCCESSFUL (total time: 6 seconds)
 */
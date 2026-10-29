
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Diego Loaza
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.print("Introduzca base: " );
        base = tcl.nextInt();
        System.out.print("Introduzca altura: " );
        altura = tcl.nextInt();
        area = base * altura / 2;
        System.out.println("El area es: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
Introduzca base: 2
Introduzca altura: 3
El area es: 3.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */
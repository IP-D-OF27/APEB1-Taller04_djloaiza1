
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. La misma es comprada por partes; CPU, teclado, pantalla, ratón."
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double CPU, teclado, pantalla, raton, costoTotal;
        System.out.print("Cuanto cuesta la CPU: $");
        CPU = tcl.nextDouble();
        System.out.print("Cuanto cuesta el teclado: $");
        teclado = tcl.nextDouble();
        System.out.print("Cuanto cuesta la pantalla: $");
        pantalla = tcl.nextDouble();
        System.out.print("Cuanto cuesta el raton: $");
        raton = tcl.nextDouble();
        costoTotal = CPU + teclado + raton + pantalla;
        System.out.println("El costo por todo es de $" + costoTotal);
        
        
    }
}

/***
 * EVIDENCIA DEL RUN:
Cuanto cuesta la CPU: $3
Cuanto cuesta el teclado: $4
Cuanto cuesta la pantalla: $2
Cuanto cuesta el raton: $4
El costo por todo es de $13.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */
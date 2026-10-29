
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes."
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double minutosMes, costoMinutos, costoTotal;
        System.out.print("Minutos de llamada este mes: ");
        minutosMes = tcl.nextDouble();
        System.out.print("Costo por minuto de llamada: ");
        costoMinutos = tcl.nextDouble();
        costoTotal = costoMinutos * minutosMes;
        System.out.println("Tu total a pagar es de: $" + costoTotal);

    }
}

/***
 * EVIDENCIA DEL RUN:
Minutos de llamada este mes: 15
Costo por minuto de llamada: 2
Tu total a pagar es de: $30.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */
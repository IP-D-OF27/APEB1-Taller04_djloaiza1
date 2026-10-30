
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKV, cantidadKV, edad, descuento, costoMes;
        System.out.print("Introduzca su edad: ");
        edad = tcl.nextDouble();
        System.out.print("Introduzca el costo de K/h: $");
        costoKV = tcl.nextDouble();
        System.out.print("Introduzca Cantidad de K/h en el mes: ");
        cantidadKV = tcl.nextDouble();
        if (edad >= 65)
            descuento = 0.9;
        else
            descuento = 1;
        costoMes = costoKV * cantidadKV * descuento;
        System.out.println("Su total a cancelar es de: $" + costoMes);
    }
}

/***
 * EVIDENCIA DEL RUN:
Introduzca su edad: 70
Introduzca el costo de K/h: $15
Introduzca Cantidad de K/h en el mes: 50
Su total a cancelar es de: $675.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */
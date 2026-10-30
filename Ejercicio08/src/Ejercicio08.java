
import java.util.Scanner;

/**
 * Ejercicio 01: "Se debe generar una solución que permita calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. Los servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30 años se descuenta el 20% del total mensual"
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, dropbox, spotify, youtubeP, edad, descuento, total;
        System.out.print("Intruduzca su edad: ");
        edad = tcl.nextDouble();
        System.out.print("Introduzca el costo mensual de su plan de netflix: $");
        netflix = tcl.nextDouble();
        System.out.print("Intodruzca el costo mensual de dropbox: $");
        dropbox = tcl.nextDouble();
        System.out.print("Introduzca el costo mensual del Youtube Premium: $");
        youtubeP = tcl.nextDouble();
        System.out.print("Introduzca el costo de su plan de Spotify: $");
        spotify = tcl.nextDouble();
        if (edad <= 30)
            descuento = 0.7;
        else
            descuento = 1;
        total = (netflix + dropbox + spotify + youtubeP) * descuento;
        System.out.println("Su total a pagar es de: $" + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
Intruduzca su edad: 21
Introduzca el costo mensual de su plan de netflix: $15
Intodruzca el costo mensual de dropbox: $20
Introduzca el costo mensual del Youtube Premium: $10
Introduzca el costo de su plan de Spotify: $5
Su total a pagar es de: $35.0
BUILD SUCCESSFUL (total time: 11 seconds)
 */
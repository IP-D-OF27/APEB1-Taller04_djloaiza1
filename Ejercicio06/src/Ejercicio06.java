
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés mensual a cobrar."
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double prestamo, porcentaje, intereses, totalMensual;
        System.out.print("Cantidad del prestamo: $");
        prestamo = tcl.nextDouble();
        System.out.print("Porcentaje de interes: " + "%");
        porcentaje = tcl.nextDouble();
        intereses = (porcentaje / 100) + 1;
        totalMensual = intereses * (prestamo / 12);
        System.out.println("El total a pagar por mes es de " + totalMensual);
    }
}

/***
 * EVIDENCIA DEL RUN:
Cantidad del prestamo: $600
Porcentaje de interes: %15
El total a pagar por mes es de 57.49999999999999
BUILD SUCCESSFUL (total time: 4 seconds)
 */
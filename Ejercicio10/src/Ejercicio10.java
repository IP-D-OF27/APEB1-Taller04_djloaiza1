
import java.util.Scanner;

/**
 * Ejercicio 01: "El programa debe calcular el área del polígono. La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; el área de un triángulo rectángulo se calcula multiplicando su base por su altura, y luego dividiendo el resultado entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar. Polígono

Éxitos en el desarrollo de la actividad"
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double areaA, baseTri, largoRec, alturaAdya, areaTri, areaRec, areaTotal;
        System.out.print("Intruduzca la base de los triangulos: ");
        baseTri = tcl.nextDouble();
        largoRec = baseTri;
        System.out.print("Introduzca el ancho del rectangulo: ");
        alturaAdya = tcl.nextDouble();
        areaTri = baseTri * alturaAdya / 2;
        areaRec = largoRec * alturaAdya;
        areaA = baseTri * baseTri;
        areaTotal = (areaTri * 3) + areaRec + areaA;
        System.out.println("El area de los triangulos es de " + areaTri + " m2 cada uno.");
        System.out.println("El area del rectangulo es de " + areaRec + " m2");
        System.out.println("El area del cuadrado central es de " + areaA + " m2");
        System.out.println("El area total del poligono es de " + areaTotal + " m2");
    }
}

/***
 * EVIDENCIA DEL RUN:
Intruduzca la base de los triangulos: 4
Introduzca el ancho del rectangulo: 2
El area de los triangulos es de 4.0 m2 cada uno.
El area del rectangulo es de 8.0 m2
El area del cuadrado central es de 16.0 m2
El area total del poligono es de 36.0 m2
BUILD SUCCESSFUL (total time: 2 seconds)
 */
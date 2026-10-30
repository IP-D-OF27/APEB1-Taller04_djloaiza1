
import java.util.Scanner;

/**
 * Ejercicio 01: "Desarrolle una solución que determine el estado académico de una persona estudiante en una asignatura universitaria a partir de una calificación de evaluación continua, una calificación de examen final y un porcentaje de asistencia. La regla institucional establece que:

La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la nota final redondeada a un decimal."
 * @author Diego Loaiza
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double examenC, examenF, asistencia, notaF;
        System.out.print("Introduzca cantidad de asistencias: ");
        asistencia = tcl.nextDouble();
        if (asistencia >= 50) {
            System.out.print("Introduzca la nota del examen Continuo: ");
            examenC = tcl.nextDouble();
            System.out.print("Introduzca la nota del examen final: ");
            examenF = tcl.nextDouble();
            if (examenF >= 4 && examenC >=4) {
                notaF = (examenC + examenF) / 2;
                System.out.printf("Su nota final es de: %.1f%n", notaF);
                if (notaF >= 4 && notaF <= 6.4)
                    System.out.println("Usted debe rendir supletorio");
                else {
                    if (notaF >= 6.5 && notaF <= 10)
                        System.out.println("Usted esta aprovado");
                    else
                        System.out.println("Usted esta reprovado");
                   
                }    
            }
            else
                System.out.println("Usted esta reprovado por nota insuficiente en el examen final o examen complementario");
            
            
        }
        else
            System.out.println("No cumple con la cantidad de asistencias para presentar las evaluaciones por ende esta reprovado");
        
        
    }
}
    

/***
 * EVIDENCIA DEL RUN:
Introduzca cantidad de asistencias: 69
Introduzca la nota del examen Continuo: 5
Introduzca la nota del examen final: 6
Su nota final es de: 5,5
Usted debe rendir supletorio
BUILD SUCCESSFUL (total time: 13 seconds)
 */
package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej13_6notas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int bucle = 1;
        int nota;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        do {
            System.out.println("Introduce la nota del alumno " + bucle);
            nota = teclado.nextInt();
            if (nota < 4) {
                suspensos++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                aprobados++;
            }
        bucle++;
        } while (bucle < 7);

        System.out.println("Alumnos suspensos: " + suspensos);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos aprobados: " + aprobados);
    }
}

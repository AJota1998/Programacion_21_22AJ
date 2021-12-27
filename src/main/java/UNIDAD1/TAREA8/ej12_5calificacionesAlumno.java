package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej12_5calificacionesAlumno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int bucle = 1;
        int nota;
        boolean suspenso = false;

        do {
            System.out.println("Introduce la nota del alumno " + bucle);
            nota = teclado.nextInt();
                if(nota < 5) {
                    suspenso = true;
                }
            bucle++;
        } while (bucle < 6);

        if (suspenso) {
            System.out.println("Hay algún alumno suspenso");
        } else {
            System.out.println("No hay ningún alumno suspenso");
        }

    }
}

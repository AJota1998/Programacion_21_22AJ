package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej18_notatrimestre {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la nota del examen 1");
        float n1 = teclado.nextFloat();

        System.out.println("Introduce la nota del examen 2");
        float n2 = teclado.nextFloat();

        float mediatri = ((n1+n2) / 2);
        String recuperacion = "";

        if (mediatri >= 5) {
            System.out.println("Usted ha aprobado programación con una media de " + mediatri);
        } else {
            System.out.println("Media infeior a 5, resultado de la recuperación: ¿Apto o No apto?");
            recuperacion = teclado.next();
            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Su nota es un 5");
            } else {
                System.out.println("Lo siento, su nota es " + mediatri);
            }
        }
    }
}

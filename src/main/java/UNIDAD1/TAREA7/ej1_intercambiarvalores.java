package UNIDAD1.TAREA7;

import java.util.Scanner;

public class ej1_intercambiarvalores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor de A");
        int a = teclado.nextInt();

        System.out.println("Intoduzca el valor de B");
        int b = teclado.nextInt();

        int auxiliar = 0;

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Ahora el valor de A es " + a + " y el valor de B es: " + b);

    }
}

package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej16_ultimacifranumero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número entero");
        int numero = teclado.nextInt();

       int cifra = numero % 10;

        System.out.println("La última cifra de " + numero + " es " + cifra);
    }
}

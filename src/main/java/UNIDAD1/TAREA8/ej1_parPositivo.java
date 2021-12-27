package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej1_parPositivo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Introduzca un número, para terminar introduzca 0");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par");
            } else {
                System.out.println("El número " + numero + " es impar");
            }
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo");
            } else {
                System.out.println("El número " + numero + " es negativo");
            }
            System.out.println("El cuadrado de " + numero + " es: " + (numero*numero));

        } while (numero != 0);
    }
}

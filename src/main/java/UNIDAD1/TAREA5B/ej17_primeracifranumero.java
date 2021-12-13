package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej17_primeracifranumero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de hasta 5 cifras");
        int numero = teclado.nextInt();

        while (numero > 99999) {
            System.out.println("Número no válido, introduce uno de hasta 5 cifra");
            numero = teclado.nextInt();
        }

        while (numero > 9) {
            numero = numero / 10;
        }
        System.out.println("La primera cifra del número introducido es " + numero);
    }
}

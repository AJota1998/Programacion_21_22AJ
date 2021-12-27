package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej5_valoresrango {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor mínimo del rango");
        int minimo = teclado.nextInt();

        System.out.println("Introduzca el valor máximo del rango");
        int maximo = teclado.nextInt();

        int numero;
        do {
            System.out.println("Introduzca un valor dentro del rango indicado");
            numero = teclado.nextInt();
        } while (numero < minimo || numero > maximo);
    }
}

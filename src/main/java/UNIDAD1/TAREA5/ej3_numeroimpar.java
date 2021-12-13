package UNIDAD1.TAREA5;

import java.util.Scanner;

public class ej3_numeroimpar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        short numero = teclado.nextShort();

        if (numero % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }
    }
}

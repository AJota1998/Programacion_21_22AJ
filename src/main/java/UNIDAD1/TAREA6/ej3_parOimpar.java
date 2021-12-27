package UNIDAD1.TAREA6;

import java.util.Scanner;

public class ej3_parOimpar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int numero = teclado.nextInt();

        int condicion;

        if (numero % 2 == 0) {
            condicion = 1;
        } else {
            condicion = 0;
        }

        System.out.println("1 par, 0 impar: " + condicion);
    }
}

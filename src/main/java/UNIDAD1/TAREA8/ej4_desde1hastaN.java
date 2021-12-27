package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej4_desde1hastaN {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();


        for (int serie = 1; serie < numero; serie++) {
            System.out.println(serie);
        }
        System.out.println(numero);
    }
}

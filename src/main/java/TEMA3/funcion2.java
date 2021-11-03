package TEMA3;

import java.util.Scanner;

public class funcion2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número 1");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce el número 2");
        int numero2 = teclado.nextInt();

        rango(numero1, numero2);

    }
    static void rango (int numero1, int numero2) {
        for (int i = numero1; i < numero2; i++) {
            numero1++;
            System.out.println(numero1);
        }
    }

}

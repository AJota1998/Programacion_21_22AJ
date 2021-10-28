package Practica_Entregable;

import java.util.Scanner;

public class rombo_solido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una altura");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((j == altura / 2 -i) ||
                        (j == ((altura / 2) * 3) - i) ||
                        (j == altura / 2 + i) ||
                        (j == i - altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

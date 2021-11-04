package EXAMEN_AJ;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número impar para la altura");
        int altura = teclado.nextInt();

        while (altura % 2 == 0) {
            System.out.println("Introduce una altura impar válida");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= (altura * 2 - 1); j++) {
                if ((j == (altura - 1) + i) ||
                        (j== altura -1 -i) ||
                        (i == altura / 2 && j > i && j < altura + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for (int j = 0; j < altura; j++) {
                if ((j==0) || (i == 0) || (i == altura - 1)
                        || (i == altura / 2) ||
                        (j == altura - 1) ||
                        (j == altura /2 + 3))
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

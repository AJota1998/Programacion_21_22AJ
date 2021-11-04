package UTILIDADES;

import java.util.Scanner;

public class DOSLETRAS {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((j == 0)
                        || (j == altura - 1)
                        || ((j == 0 + i) && (i <= altura / 2))
                        || (j == altura - 1 - i) && (i <= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for (int j = 0; j < altura; j++) {
                if ((j == 0 + i) && (i <= altura / 2)
                        || (j == altura - 1 - i) && (i <= altura / 2)
                        || ((j == altura / 2) && (i > altura / 2))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

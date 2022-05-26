package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class FLECHADERECHAHUECA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura / 2) + 1 + 5; j++) {
                if ((j == i + 5) || (j == ((altura / 2) * 2) - i + 5) || (j == 5) || (i == (altura / 2)) && (j <= 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

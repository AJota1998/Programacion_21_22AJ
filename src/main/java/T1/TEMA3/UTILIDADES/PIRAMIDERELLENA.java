package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class PIRAMIDERELLENA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca una altura: ");
        int altura = teclado.nextInt();

        for (int i = 0 ; i < altura ; i++) {
            for (int j = 0 ; j < (altura * 2 ) - 1 ; j++ ) {
                if (j < altura - 1 - i || j > altura - 1 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

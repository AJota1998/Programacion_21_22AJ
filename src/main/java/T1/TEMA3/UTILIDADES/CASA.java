package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class CASA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        int altura = teclado.nextInt();

        while (altura < 3 || altura % 2 == 0) {
            System.out.print("Introduzca la altura: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == 0 || j == altura - 1 || ((j == 0 + i) && (i <= (altura/2))) || ((i <= (altura/2))) && ( j == altura - 1 -i))   {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = altura ; j < altura + 4 ; j++) {
                System.out.print(" ");
            }
            for (int j = altura + 4 ; j < (altura*2) + 4 ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}

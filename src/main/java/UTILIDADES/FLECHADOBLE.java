package UTILIDADES;

import java.util.Scanner;

public class FLECHADOBLE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura = 0;

        while (altura < 3 || altura % 2 == 0) {
            System.out.println("Introduzca la altura: ");
            altura = teclado.nextInt();
        }

        for (int fila = 0; fila < altura; fila++) {
            for (int colum = 0; colum <= altura; colum++) {
                if (colum == (altura / 2) - fila || colum == fila - (altura / 2)) {
                    System.out.print("*     *");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

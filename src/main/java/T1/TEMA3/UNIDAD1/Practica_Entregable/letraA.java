package T1.TEMA3.UNIDAD1.Practica_Entregable;

import java.util.Scanner;

public class letraA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una altura");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= (altura * 2) - 1; j++) {
                if ((j == (altura - 1) + i) ||
                    (j== altura -1 -i) ||
                    (i == altura / 2 && j > i && j < altura + i)) {


                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

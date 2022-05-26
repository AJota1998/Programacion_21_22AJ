package T1.TEMA3.T8B;

import java.util.Scanner;
public class T8B_9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura; j++) {

                if (j == (altura % 2) + 1 || i == (altura - 1))
                {

                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

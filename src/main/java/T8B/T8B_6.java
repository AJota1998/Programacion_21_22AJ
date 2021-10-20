package T8B;

import java.util.Scanner;

public class T8B_6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        int altura = teclado.nextInt();

        System.out.println("Introduzca el carácter");
        String caracter = teclado.next();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura * 2) - 1; j++) {
                if (i == (altura -1)|| j == (altura - 1) - i || j == (altura - 1) + i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

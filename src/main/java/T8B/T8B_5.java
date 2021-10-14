package T8B;

import java.util.Scanner;

public class T8B_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura");
        int altura = teclado.nextInt();
        System.out.println("Introduzca el carácter");
        String character = teclado.next();

        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}

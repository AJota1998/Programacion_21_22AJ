package T8;

import java.util.Scanner;

public class T8_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

            int n;
        do {
            System.out.println("Introduzca un número");
            n = teclado.nextInt();

            if (n % 2 == 0) {
                System.out.println("El número es par");
            } else System.out.println("El número es impar");
            if (n > 0) {
                System.out.println("Es positivo");
                System.out.println(n * n);
            }
        } while (n > 0);
    }
}

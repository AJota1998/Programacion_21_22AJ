package T8;

import java.util.Scanner;

public class T8_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        int v = 0;

            while (v < n) {
                v++;
                System.out.println(v);
            }
    }
}

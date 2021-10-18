package T8;

import java.util.Scanner;

public class T8_10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10");

        int n = teclado.nextInt();
        System.out.println("La tabla del " + n + " se muestra a continuación");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " es igual a " + (n * i));
        }
    }
}

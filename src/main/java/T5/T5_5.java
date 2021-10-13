package T5;

import java.util.Scanner;

public class T5_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero largo");
        long n1 = teclado.nextLong();

        System.out.println("Introduce otro numero entero largo");
        long n2 = teclado.nextLong();

        System.out.println("Introduce otro número entero largo");
        long n3 = teclado.nextLong();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El número más grande es " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número más grande es " + n2);
        } else
            System.out.println("El número más grande es " + n3);
    }
}

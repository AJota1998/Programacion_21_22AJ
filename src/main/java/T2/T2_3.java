package T2;

import java.util.Scanner;

public class T2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca numero 1");
        int n1 = teclado.nextInt();

        System.out.println("Introduzca numero 2");
        int n2 = teclado.nextInt();

        System.out.println(n1 / n2);

    }
}

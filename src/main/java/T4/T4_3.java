package T4;

import java.util.Scanner;

public class T4_3 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Introduzca nota 1");
        double n1 = teclado.nextDouble();

        System.out.println("Introduzca nota 2");
        double n2 = teclado.nextDouble();

        System.out.println("Introduzca nota 3");
        double n3 = teclado.nextDouble();

        double media = (int) ((n1 + n2 + n3) / 3);

        System.out.println("Su nota media es " + media);
    }
}

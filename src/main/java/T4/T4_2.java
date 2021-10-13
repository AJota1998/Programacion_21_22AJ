package T4;

import java.util.Scanner;

public class T4_2 {
    public static void main(String[] args) {

        Scanner teclado =  new Scanner(System.in);

        System.out.println("Introduzca nota 1");
        double n1 = teclado.nextDouble();

        System.out.println("Introduzca nota 2");
        double n2 = teclado.nextDouble();

        double media = ((n1 + n2) / 2);

        System.out.println("Su nota media es " + media);
    }
}

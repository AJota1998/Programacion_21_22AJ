package T3;

import java.util.Scanner;

public class T3_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero real");
        double n1 = teclado.nextDouble();

        System.out.println("Introduzca otro numero real");
        double n2 = teclado.nextDouble();

        double op = (n1 / n2);

        System.out.println("El resultado es " + op);
    }
}

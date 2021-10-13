package T4;

import java.util.Scanner;

public class T4_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número decimal");
        double n = teclado.nextDouble();

        double op = (int) (Math.round(n));

        System.out.println(op);
    }
}

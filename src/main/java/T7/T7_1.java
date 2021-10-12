package T7;

import java.util.Scanner;

public class T7_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca valor de a");
        int a = teclado.nextInt();

        System.out.println("Introduzca valor de b");
        int b = teclado.nextInt();

        int aux = b;
        b = a;
        a = aux;

        System.out.println("Ahora el valor de a es " + a + "y el valor de b es " + b);
    }
}

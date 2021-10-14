package T8;

import java.util.Scanner;

public class T8_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca valor mínimo");
        int r1 = teclado.nextInt();

        System.out.println("Introduzca valor máximo");
        int r2 = teclado.nextInt();
        int valor;

        do {
            System.out.println("Introduce un valor dentro del rango");
            valor = teclado.nextInt();
        } while (valor < r1 || valor > r2);
    }
}
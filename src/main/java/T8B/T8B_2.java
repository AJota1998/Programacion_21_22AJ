package T8B;

import java.util.Scanner;

public class T8B_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = teclado.nextInt();

        for (int numero = num; numero > (num + 5); num++ ) {

            System.out.print("Número " + num + "   ");
            System.out.print("El cuadrado de " + num + " es " + (num * num) + "   ");
            System.out.print("El cubo de " + num + " es " + (num * num * num) + "   ");
        }
    }
}

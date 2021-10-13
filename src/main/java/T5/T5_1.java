package T5;

import java.util.Scanner;

public class T5_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();

        if (numero >= 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else
            System.out.println("El numero " + numero + " es negativo");
    }
}

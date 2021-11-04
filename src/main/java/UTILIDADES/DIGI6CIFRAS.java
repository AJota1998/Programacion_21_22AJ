package UTILIDADES;

import java.util.Scanner;

public class DIGI6CIFRAS {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número de 6 cifras: ");
        int numero = teclado.nextInt();

        while (numero < 100000 || numero > 999999) {
            System.out.print("Introduce un número de 6 cifras: ");
            numero = teclado.nextInt();
        }

        int dig = 0;
        int resto;
        int numero2 = 0;

        while (dig < 3) {
            resto = numero % 10;
            numero = numero / 10;
            numero2 = (numero2 * 10) + resto;
            dig++;
        }

        int var = 0;

        while (numero2 > 0) {
            resto = numero2 % 10;
            numero2 = numero2 / 10;
            var = (var * 10) + resto;
        }
    }
}

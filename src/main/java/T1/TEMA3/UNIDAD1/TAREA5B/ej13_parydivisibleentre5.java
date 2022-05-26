package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej13_parydivisibleentre5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println("El número " + numero + " es par y divisible entre 5");
        } else if (numero % 2 == 0 && numero % 5 != 0) {
            System.out.println("El número " + numero + " es solo par");
        } else if (numero % 2 != 0 && numero % 5 == 0) {
            System.out.println("El número es solo divisible entre 5");
        }
    }
}

package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array");
        int l = teclado.nextInt();

        int[] a = new int[l];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce un número");
            a[i] = teclado.nextInt();
        }
        System.out.print("Array indicado " + Arrays.toString(a));
        System.out.println("El número de impares es " + impares(a));
    }

    static int impares(int[] a) {

        int impares = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }
}

package TEMA3.arrays;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantos números desea introducir?");
        int cantidad = teclado.nextInt();

        int a[] = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número");
            a[i] = teclado.nextInt();
        }
        for (int i = cantidad - 1; i > -1; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

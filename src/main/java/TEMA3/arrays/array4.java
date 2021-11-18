package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una longitud de dígitos de clave");
        int l = teclado.nextInt();

        int[] clave = new int[l];

        for (int i = 0; i < l; i++) {
            clave[i] = (int) (1 + (Math.random() * 6));
        }

        int[] prueba = new int[l];


        for (int i = 0; i < l; i++) {
            System.out.println("Introduce un numero entre 1 y 5");
            prueba[i] = teclado.nextInt();
        }

        System.out.println("Intente acertarlo");

        for (int i = 0; i < l; i++) {
            if (clave[i] < prueba[i]) {
                System.out.println("Es menor");
            } else if (clave[i] > prueba[i]) {
                System.out.println("Es mayor");
            } else {
                System.out.println("Es igual");
            }
        }

        while (!Arrays.equals(clave, prueba)) {
            System.out.println("Inténtelo de nuevo");
            for (int i = 0; i < l; i++) {
                System.out.println("Introduce un número entre 1 y 5");
                prueba[i] = teclado.nextInt();
            }
            for (int i = 0; i < l; i++) {
                if (clave[i] < prueba[i]) {
                    System.out.println("Es menor");
                } else if (clave[i] > prueba[i]) {
                    System.out.println("Es mayor");
                } else {
                    System.out.println("Es igual");
                }
            }

        }
    }
}



package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] a = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número decimal");
            a[i] = teclado.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        for (double ejemplo: a) { //ejemplo de foreach, para imprimir los valores de un array
            System.out.print(ejemplo + " ");
        }
        System.out.println(Arrays.toString(a)); //Pasar un array a String
    }
}

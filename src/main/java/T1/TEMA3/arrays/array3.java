package T1.TEMA3.arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();

        int a[] = new int [numero];
        int ceros = 0;
        double positivos = 0;
        double mediap = 0;
        double negativos = 0;
        double median = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce la cantidad de números indicada");
            a[i] = teclado.nextInt();
            if (a[i] > 0) {
                mediap ++;
                positivos = positivos + a[i];
            } else if (a[i] < 0) {
                median ++;
                negativos = negativos - a[i];
            } else {
                ceros ++;
            }
        }
        System.out.println("La suma de ceros es: " + ceros);
        System.out.println("La media de positivos es: " + (positivos / mediap));
        System.out.println("La media de negativos es: " + (negativos / median));
    }
}

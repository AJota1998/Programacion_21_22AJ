package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        System.out.println("Introduce la longitud deseada");
//        int longitud = teclado.nextInt();

//        System.out.println("---Vamos a ordenar dos arrays de " + longitud + " dígitos---");

        int []serie1= {10, 12345, -15, 0, 7};



//        for (int i = 0; i < longitud; i++) {
//            System.out.println("Introduce un número");
//            serie1[i]= teclado.nextInt();
//        }
        Arrays.sort(serie1);

        int []serie2 = {4, 0, 3, 6, 7};

//        for (int i = 0; i < longitud; i++) {
//            System.out.println("Introduce un número");
//            serie2[i] = teclado.nextInt();
//        }
        Arrays.sort(serie2);

        int []ordenado = new int[5 * 2];
        int contserie1 = 0;
        int contserie2 = 0;
        int contorden = 0;

        while (contorden != ordenado.length) {
//            System.out.println(contorden);
            System.out.println("contador serie1 - " + contserie1);
            System.out.println("contador serie2 - " + contserie2);
            System.out.println("array resultado - " + Arrays.toString(ordenado));
            if (contserie1 < serie1.length && contserie2 < serie2.length && serie1[contserie1] < serie2[contserie2]) {
                ordenado[contorden] = serie1[contserie1];
                contserie1++;
                contorden++;
            } else if (contserie1 < serie1.length && contserie2 < serie2.length && serie1[contserie1] >= serie2[contserie2]) {
                ordenado[contorden] = serie2[contserie2];
                contserie2++;
                contorden++;
            }
            if (contserie1 == serie1.length-1) {
                ordenado[contorden] = serie2[contserie2];
                contserie2++;
                contorden++;
            } else if (contserie2 == serie2.length-1) {
                ordenado[contorden] = serie1[contserie1];
                contserie1++;
                contorden++;
            }

        } for (double ejemplo: ordenado) {
            System.out.print(ejemplo);
        }
    }
}

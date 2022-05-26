package T1.TEMA3.arrays;

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        int[] serie1 = {89, 9, 2, 3, 13, 8};
        Arrays.sort(serie1);

        System.out.println(Arrays.toString(serie1));
        int[] serie2 = {1, 3, 5, 1, 98, 23};
        Arrays.sort(serie2);

        System.out.print(Arrays.toString(serie2));

        int[] ordenado = new int[serie1.length + serie2.length];
        int contordenado = 0;
        int ccontserie1 = 0;
        int contserie2 = 0;

        while (contordenado != ordenado.length) {

            if (ccontserie1 == serie1.length) {
                ordenado[contordenado] = serie2[contserie2];
                contserie2++;
                contordenado++;
            } else if (contserie2 == serie2.length) {
                ordenado[contordenado] = serie1[ccontserie1];
                ccontserie1++;
                contordenado++;
            } else if (serie1[ccontserie1] <= serie2[contserie2]) {
                ordenado[contordenado] = serie1[ccontserie1];
                ccontserie1++;
                contordenado++;
            } else {
                ordenado[contordenado] = serie2[contserie2];
                contserie2++;
                contordenado++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(ordenado));
        }
    }

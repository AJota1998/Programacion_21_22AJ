package T1.TEMA3.arrays2;

import java.util.Arrays;

public class adicional6 {
    public static void main(String[] args) {

        int[][] matriz = new int[6][10];
        boolean repetido;
        int numRandom;
        int min = 1000;
        int max = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                numRandom = (int) (Math.random() * 1001);
                repetido = false;
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz[k].length; l++) {
                        if (numRandom == matriz[k][l]) {
                            repetido = true;
                            break;
                        }
                    }
                }
                if (repetido) {
                    if (j > 0) {
                        j--;
                    }else {
                        i--;
                        j=matriz.length-1;
                    }
                } else {
                    matriz[i][j] = numRandom;
                    if (numRandom < min) min = numRandom;
                    if (numRandom > max) max = numRandom;
                }
            }
        }
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        String posMin = "";
        String posMax = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (min == matriz[i][j]) posMin = "["+ i + "] [" + j + "]";
                if (max == matriz[i][j]) posMax = "["+ i + "] [" + j + "]";
            }
        }
        System.out.println("El máximo esta en la posición " + posMax);
        System.out.println("El mínimo esta en la posición " + posMin);
    }
}

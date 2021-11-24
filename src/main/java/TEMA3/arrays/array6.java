package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] a = {1, 2, 3, 5, 5, 7, 6, 7, 9};

        System.out.println(Arrays.toString(sin_repetidos(a)));
    }

    static int[] sin_repetidos(int[] a) {
        int[] result = new int[0];
        int id_result = 0;

        for (int i = 0; i < a.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < result.length; j++) {
                if (a[i] == result[j]) {
                    repetido = true;
                    break;
                }
            }
                 if (!repetido) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[id_result] = a[i];
                    id_result++;
            }
        }
        return result;
    }
}

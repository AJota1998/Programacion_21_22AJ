package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fila = 5;
        int columna = 5;

        int [][]tabla = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tabla [i][j] = i + j;
            }
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}

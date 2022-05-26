package T1.TEMA3.EXAMEN2021_AJ_TARDE;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //solicito al usuario el número de filas y el número de columnas
        System.out.println("Introduce el número de filas");
        int i = teclado.nextInt();

        System.out.println("Introduce el número de columnas");
        int j = teclado.nextInt();

        //creo la matriz con las dimensiones que nos ha indicado el usuario
        int[][] x = new int[i][j];

        //relleno la matriz bidimensional con números aleatorios entre 11 y 1003
        for (int k = 0; k < x.length; i++) {
            for (int l = 0; l < x[k].length; j++) {
                x[k][l] = (int) (11 + Math.random() * 993);
            }
        }
        //imprimo la matriz para comprobarlo
        for (int[] array : x) {
            System.out.println(Arrays.toString(array));
        }

        //aqui deberiamos imprimir el llamado a la función
        System.out.println(esPuntoDeSilla(x, i, j));

    }
    public static boolean esPuntoDeSilla(int x[][], int i, int j) {

        //creo una variable boleana false que pondré en true cuando sea mínimo de fila y máximo de columna
        boolean puntosilla = false;
        int maximo = 0;
        int minimo = 1003;

        for (int k = 0; k < x.length; k++) {
            for (int l = 0; l < x[k].length; l++) {
                if (x[k][l] < minimo) {
                    minimo = x[k][l];
                }
            }
        }

        return puntosilla;
    }
}
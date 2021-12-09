package entregable21_22AJ;

import java.util.Arrays;

public class ej4 {
    public static void main(String[] args) {

        String[][] matriz = new String[3][3];
        matriz[0] = new String[] {"a", "b", "c"};
        matriz[1] = new String[] {"d", "e", "f"};
        matriz[2] = new String[] {"g", "h", "i"};

        String[] fila = {"j", "k", "l"};
        int pos = 3;

        for (String[] strings : matriz) {
            System.out.println(Arrays.toString(strings));
        }
            System.out.println("---------");
        System.out.println(Arrays.deepToString(insertarFilaEnMatriz(matriz, fila, pos)));
    }
    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {

        String[][] matrizfinal = new String[4][3];
        for (int i = 0; i < matrizfinal.length; i++) {
            if (i < pos) {
            matrizfinal[i] = matriz[i];
            } else if (i == pos) {
            matrizfinal[i] = fila;
            } else {
            matrizfinal[i] = matriz[i - 1];
            }
            System.out.println(Arrays.toString(matrizfinal[i]));
        }
        return matrizfinal;
    }
}

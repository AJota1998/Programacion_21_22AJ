package ENTREGABLES.examen2021mañanaazul;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {

        String[][] tablero = new String[8][8];

        String letra = "abcdefgh";
        short numero = 8;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = letra.charAt(j) + String.valueOf(numero);
            }
            numero--;
            System.out.println(Arrays.toString(tablero[i]));
        }

        String posReina = "d7";
        String posRey = "h3";

        System.out.println(jaque(posRey, posReina));

    }
    public static boolean jaque(String posRey,String posReina) {

        boolean sijaque = false;


        String[][] tablero = new String[8][8];

        String letra = "abcdefgh";
        short numero = 8;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = letra.charAt(j) + String.valueOf(numero);
            }
            numero--;
            System.out.println(Arrays.toString(tablero[i]));
        }

        if (posReina.charAt(0) == posRey.charAt(0) || posReina.charAt(1) == posRey.charAt(1)) {
            sijaque = true;
        }
        // creamos las coordenadas donde guardar a la reina
        int reinaI = 0;
        int reinaJ = 0;

        //buscamos la posicion de la reina para guardarla
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equalsIgnoreCase(posReina)) {
                    reinaI = i;
                    reinaJ = j;
                }
            }
        }
        //guardamos la reina en la posicio "" de la matriz

        System.out.println("i:" + reinaI);
        System.out.println("j:" + reinaJ);

        //ahora estamos moviendo a la reina en diagonal hasta los topes en todos los casos posibles

        while (reinaI < tablero.length && reinaJ < tablero.length) {
            reinaI++;
            reinaJ++;
        }

        while (reinaI < tablero.length && reinaJ >= 0) {
            reinaI++;
            reinaJ--;
        }

        while (reinaI >= 0 && reinaJ < tablero.length) {
            reinaI--;
            reinaJ++;
        }

        while (reinaI >= 0 && reinaJ >= 0) {
            reinaI--;
            reinaJ--;
        }


        int reyI = 0;
        int reyJ = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equalsIgnoreCase(posRey)) {
                    reyI = i;
                    reyJ = j;
                }
            }
        }




        return sijaque;
    }
}
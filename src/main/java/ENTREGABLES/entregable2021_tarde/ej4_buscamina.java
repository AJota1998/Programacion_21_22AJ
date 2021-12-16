package ENTREGABLES.entregable2021_tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ej4_buscamina {
    public static void main(String[] args) {
        // Juego del buscaminas
        //
        // Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N
        // columnas.
        //
        // A continuación rellenar el vector colcando las casillas de manera aleatoria
        //
        // O bien un carácter X que significa que hay una bomba.
        // O bien un carácter - que significa que esa casilla no hay nada.
        // A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
        //
        // En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar
        // por pantalla la cantidad de bombas que hay en las casillas de alrededor.
        //
        // Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que
        // el usuario encuentre una bomba).
        Scanner teclado = new Scanner(System.in);

        //    System.out.println("Introduzca el número que dará la altura y la anchura del juego:");
        //    System.out.println();
        //    int num = teclado.nextInt();

        String[][] tablero = new String[5][5];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                int rellenar = (int) (Math.random() * 7);
                if (rellenar < 2) {
                    tablero[i][j] = "X";
                } else {tablero[i][j] = "-";}
            }
        }

        int filaNum;
        String fila;
        int columnaNum;
        String columna;
        String[][] jugada = new String[tablero.length][tablero.length];

        for (int i = 0; i < jugada.length; i++) {
            for (int j = 0; j < jugada[i].length ;j++) {
                jugada[i][j] = "0";
            }
        }

        do {
            System.out.println("Introduzca una posición para ver si hay una bomba. Debe separar " +
                    "los números con una coma, como en el ejemplo (1,1):");
            String posicion = teclado.next();
            fila = String.valueOf(posicion.charAt(0));
            columna = String.valueOf(posicion.charAt(2));
            filaNum = Integer.parseInt(String.valueOf(fila));
            columnaNum = Integer.parseInt(String.valueOf(columna));
            int bombas = 0;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if(tablero[filaNum][columnaNum].equals("-")) {
                        jugada[filaNum][columnaNum] = tablero[filaNum][columnaNum];
                    } else {
                        jugada[filaNum][columnaNum] = tablero[filaNum][columnaNum];
                        break;
                    }
                }
            }
            for (int k = 0; k < jugada.length; k++) {
                System.out.println(Arrays.toString(jugada[k]));
            }
            System.out.println("Hay " + bombas + " bombas alrededor de " + posicion+".");

        } while (!tablero[filaNum][columnaNum].equals("X"));
        System.out.println("¡Mala suerte! Has pisado una bomba :(");
    }
}

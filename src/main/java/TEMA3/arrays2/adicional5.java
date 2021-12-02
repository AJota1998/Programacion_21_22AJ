package TEMA3.arrays2;

import java.util.Arrays;

public class adicional5 {
    public static void main(String[] args) {

        //1- Creamos el array bidimensional

        int fila = 10;
        int columna = 10;
        int [][]array = new int[fila][columna];

        //2- Rellenar con numeros aleatorios entre 200 y 300

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                array[i][j] = (int) (200 + Math.random() * 101);
            }
        }
        for (int[] imprime: array) {
            System.out.println(Arrays.toString(imprime));
        }

        //3- Mostrar números de la diagonal de la esquina superior izquierda a inferior derecha

        int []diagonal = new int[10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j) {
                    diagonal[i]= array[i][j];
                    System.out.println(array[i][j]);
                }
            }
        }

        //4- Mostrar máximo, mínimo y media de los mismos

        int maximo = 0;
        int minimo = diagonal[0];
        double media = 0;
        int contador = 0;

        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] > maximo) {
                maximo = diagonal[i];
            } else if (diagonal[i] < minimo) {
                minimo = diagonal[i];
            }
            contador++;
            media = (media + diagonal[i]);
        }
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("La media es: " + media / contador);
    }
}




package ENTREGABLES.entregable21_22AJ;

import java.util.Arrays;
import java.util.Scanner;

public class ej3_maximosMinimosETC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca numero filas");
        int fila = teclado.nextInt();
        System.out.println("Introduzca numero de columnas");
        int columna = teclado.nextInt();

        int [][]array = new int[fila][columna];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (14 + Math.random() * 65);
            }
            System.out.println(Arrays.toString(array[i]));
        }

        int []pares = new int[0];
        int []impares = new int[0];
        int contadorpares = 0;
        int contadorimpares = 0;
        int sumapares = 0;
        int sumaimpares = 0;
        int maximopares = 0;
        int minimopares = 79;
        int maximoimpares = 0;
        int minimoimpares = 79;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0 && i % 2 == 0) {
                    pares = Arrays.copyOf(pares, pares.length +1);
                    pares[contadorpares] = array[i][j];
                    contadorpares++;
                    sumapares = sumapares + array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 != 0 && i % 2 != 0) {
                    impares = Arrays.copyOf(impares, impares.length +1);
                    impares[contadorimpares] = array[i][j];
                    contadorimpares++;
                    sumaimpares = sumaimpares + array[i][j];
                }
            }
        }

        for (int i = 0; i < pares.length; i++) {
            if (pares[i] > maximopares) {
                maximopares = pares[i];
            } if (pares[i] < minimopares) {
                minimopares = pares[i];
            }
        }
        for (int i = 0; i < impares.length; i++) {
            if (impares[i] > maximoimpares) {
                maximoimpares = impares[i];
            } if (impares[i] < minimoimpares) {
                minimoimpares = impares[i];
            }
        }
        System.out.println("Pares " + Arrays.toString(pares));
        System.out.println("Impares " + Arrays.toString(impares));
        System.out.println("Suma de los pares " + sumapares);
        System.out.println("Suma de los impares " + sumaimpares);
        System.out.println("Máximo de pares " + maximopares);
        System.out.println("Mínimo de impares " + minimoimpares);
        System.out.println("Media pares " + sumapares / contadorpares);
        System.out.println("Media impares " + sumaimpares / contadorimpares);
        System.out.println("Mínimo pares " + minimopares);
        }
    }


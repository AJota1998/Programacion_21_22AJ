package T1.TEMA3.arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class adicional3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int filas = 2;
        int columnas = 10;

        int[][] salon = new int[filas][columnas];

        for (int i = 0; i < columnas; i++) {
            salon[0][i] = i + 1;
        }
        for (int i = 0; i < columnas; i++) {
            salon[1][i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.deepToString(salon));

        int dato = 0;
        do {
            System.out.println("¿Cuántos son?, (Introduzca -1 para salir)");
            dato = teclado.nextInt();
            if (dato > 4) {
                System.out.println("Lo siento, no admitimos grupos mayores de 4");
            } else if (dato == -1) {
                System.out.println("Gracias, Hasta pronto");
            }
            if (dato >= 0 && dato < 5) {
                boolean sentado = false;
                for (int i = 0; i < columnas; i++) {
                    if (salon[1][i] == 0) {
                        System.out.println("Por favor, siéntense en la mesa " + (i + 1));
                        salon[1][i] = salon[1][i] + dato;
                        System.out.println(Arrays.deepToString(salon));
                        sentado = true;
                        break;
                    }
                }
                 if (!sentado) {
                     for (int i = 0; i < columnas; i++) {
                         if (salon[1][i] + dato <= 4) {
                             System.out.println("Tendrán que compartir messa, Por favor sientese en la mesa " + (i + 1));
                             salon[1][i] = salon[1][i] + dato;
                             System.out.println(Arrays.deepToString(salon));
                             sentado = true;
                             break;
                         }
                     }
                 }
                if (!sentado) {
                    System.out.println("Lo siento, en estos momentos no queda sitio");
                    System.out.println(Arrays.deepToString(salon));
                }
            }
        } while (dato != - 1);
    }
}



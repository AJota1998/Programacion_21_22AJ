package T1.TEMA3.arrays2;

import java.util.Scanner;

public class adicional1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int []array100 = new int[100];

        for (int i = 0; i < array100.length; i++) {
            array100[i] = (int) (Math.random() * 501);
        }
        for (int i = 0; i < array100.length; i++) {
            System.out.print(array100[i] + " ");
        }
        System.out.println();
        System.out.println("Para conocer el máximo introduzca 1, 2 para el mínimo");
        int dato = teclado.nextInt();

        int max = 0;
        int min = array100[0];

        for (int i = 0; i < array100.length; i++) {
            if (max < array100[i]) {
                max = array100[i];
            }
        }
        for (int i = 0; i < array100.length; i++) {
            if (min > array100[i]) {
                min = array100[i];
            }
        }
        if (dato == 1) {
            System.out.println("El máximo es " + max);
        } else if (dato == 2) {
            System.out.println("El mínimo es " + min);
        }
    }

}

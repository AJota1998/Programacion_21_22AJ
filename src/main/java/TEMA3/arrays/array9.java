package TEMA3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int []apuesta = {23, 4, 6, 54, 17, 96};
        int []ganadora = new int[6];

        for (int i = 0; i < ganadora.length; i++) {
            ganadora[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println(Arrays.toString(apuesta));
        System.out.println(Arrays.toString(ganadora));

        if (num_aciertos(apuesta, ganadora) == 0) {
            System.out.println("Número de aciertos " + num_aciertos(apuesta, ganadora) + " No has dao ni bola, chaval");
        } else if (num_aciertos(apuesta, ganadora) > 0 && num_aciertos(apuesta, ganadora) <=3) {
            System.out.println("Número de aciertos " + num_aciertos(apuesta, ganadora) + " No ha estado mal del todo");
        } else if (num_aciertos(apuesta, ganadora) > 3 && num_aciertos(apuesta, ganadora) < 6) {
            System.out.println("Número de aciertos " + num_aciertos(apuesta, ganadora) + "Lo has rozado, tío");
        } else if (num_aciertos(apuesta, ganadora) == 6) {
            System.out.println("Número de aceirtos " + num_aciertos(apuesta, ganadora) + " Ve pensando en tu nueva vida, Enhorabuena");
        }

    }
    static int num_aciertos(int[]apuesta, int[]ganadora) {
        int aciertos = 0;
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora [j]) {
                    aciertos++;
                }
            }
        } return aciertos;
    }
}

package T1.TEMA3.UTILIDADES.INTERNET;

import java.util.Arrays;

public class ej12 {
    public static void main(String[] args) {

        int divisibles = 0;
        int []divi = new int[0];

        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0 && i % 3 == 0) {
                divi = Arrays.copyOf(divi, divi.length + 1);
                divi[divisibles++] = i; //Al poner divisibles++ nos ahorramos una linea para incremetar el contador.
            }
        }
        System.out.println("El total de numeros divisibles entre 2 y 3 es " + divisibles);
        System.out.println();
        System.out.print("Números: " + Arrays.toString(divi));
    }
}

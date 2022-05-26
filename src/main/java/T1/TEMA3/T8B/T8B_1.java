package T1.TEMA3.T8B;

import java.util.Scanner;

public class T8B_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int oportunidades = 0;
        final int comb = 1998;

        for (int i = oportunidades; oportunidades < 4; i++) {
            oportunidades++;
            System.out.println("Introduzca la combinación");
            int combinacion = teclado.nextInt();

            if (combinacion == comb) {
                System.out.println("La caja se ha abierto satisfactoriamente");
                break;
            } else
                System.out.println("Lo siento, esa no es la combinacion");
                System.out.println("Máximo de errores alcanzados, prueba otra vez");
        }

    }
}

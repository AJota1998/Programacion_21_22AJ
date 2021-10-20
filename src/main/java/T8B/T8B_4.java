package T8B;

import java.util.Scanner;

public class T8B_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        int recuento = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número");
            int n = teclado.nextInt();
            recuento++;
            if (n > 0) {
                positivo++;
            } else if (n < 0) {
                negativo++;
            }
        }
        System.out.println("Total de números negativos " + negativo);
        System.out.println("Total de números positivos " + positivo);
    }
}

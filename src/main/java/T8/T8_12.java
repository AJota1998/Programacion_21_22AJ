package T8;

import java.util.Scanner;

public class T8_12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double notas = 0;
        int nsus = 0;

            do {
                System.out.println("Introduce la nota");
                notas++;
                double n = teclado.nextDouble();
                    if (n < 5) {
                        nsus++;
                    }
            } while (notas < 5);

        System.out.println("El número de suspensos es igual a " + nsus);
    }
}

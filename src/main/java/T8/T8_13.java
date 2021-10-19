package T8;

import java.util.Scanner;

public class T8_13 {

    public static void main(String[] args) {

        Scanner teclado = new  Scanner(System.in);

        double notas = 0;
        int aprobados = 0;
        int suspensos = 0;
        int condicionales = 0;

        do {
            System.out.println("Introduce la nota");
            double n = teclado.nextDouble();
            notas++;
                if (n >= 5) {
                    aprobados++;
                } else if (n < 5 && n >= 4) {
                    condicionales++;
                } else
                    suspensos++;
        } while (notas < 6);

        System.out.println("El número de aprobados es igual a " + aprobados);
        System.out.println("El número de condicionales es igual a " + condicionales);
        System.out.println("El número de suspensos es igual a " + suspensos);
    }
}

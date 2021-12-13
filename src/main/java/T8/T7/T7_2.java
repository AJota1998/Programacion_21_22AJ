package T8.T7;

import java.util.Scanner;

public class T7_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la edad");
        int edad = teclado.nextInt();

        System.out.println("Introduce el nivel de estudios");
        int estudios = teclado.nextInt();

        System.out.println("Introduce los ingresos anuales");
        int ingresos = teclado.nextInt();

        boolean jasp;

        if (edad <= 28 && estudios > 3 && ingresos > 28000) {
            jasp = true;
            System.out.println("Verdadero");

        } else
            jasp = false;
            System.out.println("Falso");
    }
}

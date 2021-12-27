package UNIDAD1.TAREA7;

import java.util.Scanner;

public class ej2_variablejasp {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la edad");
        int edad = teclado.nextInt();

        System.out.println("Intoduzca el nivel de estudios; 0-5");
        int estudios = teclado.nextInt();

        System.out.println("Ingresos anuales");
        double ingresos = teclado.nextDouble();

        boolean situacion = false;

        if (edad <= 28 && estudios > 3 && ingresos > 28000) {
            situacion = true;
        }

        System.out.println("Situación: " + situacion);
    }
}

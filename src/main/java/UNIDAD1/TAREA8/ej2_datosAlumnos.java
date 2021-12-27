package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej2_datosAlumnos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int edad;
        int sumaedad = 0;
        int M18 = 0;

        do {
            System.out.println("Introduzca la edad del alumno");
            edad = teclado.nextInt();
            contador++;
            sumaedad = sumaedad + edad;
            if (edad >= 18) {
                M18++;
            }

        } while (edad > 0);

        double media = (double) sumaedad / contador;

        System.out.println("Número total de registros: " + contador);
        System.out.println("Suma de edades: " + sumaedad);
        System.out.println("Media de edades: " + media);
        System.out.println("Alumnos mayores de edad: " + M18);

    }
}

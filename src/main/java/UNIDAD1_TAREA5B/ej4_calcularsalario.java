package UNIDAD1_TAREA5B;

import java.util.Scanner;

public class ej4_calcularsalario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valor_hora = 12;
        int valor_hora_extra = 16;

        System.out.println("Introduce el número de horas semanales");
        int numerohoras = teclado.nextInt();

        if (numerohoras > 0 && numerohoras < 41) {
            System.out.println("El sueldo semanal es " + (numerohoras * valor_hora));
        } else if (numerohoras >= 41) {
            System.out.println("El sueldo semanal es " + ((40*12) + ((numerohoras-40) * 16)));
        } else if (numerohoras < 0) {
            System.out.println("Número de horas incorrectas");
        }
    }
}

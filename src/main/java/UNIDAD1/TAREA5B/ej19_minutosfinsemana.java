package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej19_minutosfinsemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el dia de la semana: Lunes, Martes, Miercoles, Jueves o Viernes:");
        String dia = teclado.nextLine();
        System.out.print("Introduzca la hora: ");
        int hora = teclado.nextInt();
        System.out.print("Introduzca los minutos: ");
        int min = teclado.nextInt();

        int mintfd = 6660;

        if (dia.equals("Lunes")) {
            System.out.println("Faltan: " + (mintfd - (((hora * 60) + min)) + " minutos"));
        } else if (dia.equals("Martes")) {
            System.out.println("Faltan: " + ((mintfd - 1440) - (((hora * 60) + min)) + " minutos"));
        } else if (dia.equals("Miercoles")) {
            System.out.println("Faltan: " + ((mintfd - (1440 * 2)) - (((hora * 60) + min)) + " minutos"));
        } else if (dia.equals("Jueves")) {
            System.out.println("Faltan: " + ((mintfd - (1440 * 3)) - (((hora * 60) + min)) + " minutos"));
        } else if (dia.equals("Viernes")) {
            System.out.println("Faltan: " + ((mintfd - (1440 * 4)) - (((hora * 60) + min)) + " minutos"));
        }
    }
}


package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej9_horoscopo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el día de nacimiento");
        int dia = teclado.nextInt();

        System.out.println("Introduce el mes de nacimiento (1-12)");
        int mes = teclado.nextInt();

        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 19)) {
            System.out.println("Acuario");
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            System.out.println("Piscis");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            System.out.println("Aries");
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            System.out.println("Tauro");
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            System.out.println("Geminis");
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 23)) {
            System.out.println("Cancer");
        } else if ((mes == 7 && dia >= 24) || (mes == 8 && dia <= 23)) {
            System.out.println("Leo");
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 22)) {
            System.out.println("Escorpio");
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario");
        } else {
            System.out.println("No es una fecha valida");
        }
    }
}

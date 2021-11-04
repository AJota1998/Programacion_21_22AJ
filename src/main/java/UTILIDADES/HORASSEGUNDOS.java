package UTILIDADES;

import java.util.Scanner;

public class HORASSEGUNDOS {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca horas: ");
        int hora = teclado.nextInt();
        System.out.print("Introduzca minutos: ");
        int min = teclado.nextInt();
        System.out.print("Introduzca segundos: ");
        int seg = teclado.nextInt();
        System.out.print("Introduzca número de segundos a incrementar: ");
        int inseg = teclado.nextInt();

        System.out.println("Aumentando la hora...");

        for (int i = 0; i < inseg; i++) {
            seg++;
            if (seg > 59) {
                seg = 00;
                min++;
                if (min > 59) {
                    min = 00;
                    hora++;
                    if (hora > 23) {
                        hora = 00;
                    }
                }
            }

            System.out.println(hora + ":" + min + ":" + seg);

        }
    }
}

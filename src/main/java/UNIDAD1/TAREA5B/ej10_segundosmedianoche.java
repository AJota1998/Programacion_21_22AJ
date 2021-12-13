package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej10_segundosmedianoche {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la hora");
        int hora = teclado.nextInt();

        System.out.println("Introduce los minutos");
        int minutos = teclado.nextInt();

        final int segundosdia = 86400;

        int segundosusuario = (hora*(minutos*60));

        int resolucion = segundosdia - segundosusuario;

        System.out.println("Para la media noche faltan " + resolucion + " segundos");
    }
}

package UNIDAD1.TAREA4;

import java.util.Scanner;

public class ej5_horaactual {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los minutos");
        short minutos = teclado.nextShort();

        System.out.println("Introduce la hora");
        short hora = teclado.nextShort();

        System.out.println("La hora actual es " + hora + ":" + minutos);
    }
}

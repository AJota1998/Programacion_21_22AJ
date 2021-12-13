package UNIDAD1.TAREA3;

import java.util.Scanner;

public class ej2_denacimientoaactual {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su año de nacimiento");
        short nacimiento = teclado.nextShort();

        System.out.println("Introduzca el año actual");
        short actual = teclado.nextShort();

        short edad = (short) (actual - nacimiento);

        System.out.println("Su edad es " + edad);
    }
}

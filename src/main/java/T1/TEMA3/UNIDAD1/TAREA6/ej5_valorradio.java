package T1.TEMA3.UNIDAD1.TAREA6;

import java.util.Scanner;

public class ej5_valorradio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor del radio");
        int radio = teclado.nextInt();
        final float pi = 3.14f;


        short numero;
        do {
            System.out.println("Introduzca 1 para diametro, 2 para perímetro, 3 para área");
            numero = teclado.nextShort();
        } while (numero > 3 || numero < 1);


        if (numero == 1) {
            System.out.println("Diametro: " + (2 * radio));
        } else if (numero == 2) {
            System.out.println("Perímetro: " + (2 * pi * radio));
        } else {
            System.out.println("Area: " + (pi * radio * radio));
        }
    }
}
package UNIDAD1.TAREA5;

import java.util.Scanner;

public class ej2_numerocorrecto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número 12");
        short numero = teclado.nextShort();

        if (numero == 12) {
            System.out.println("Correcto, el número es 12");
        } else {
            System.out.println("Error, el número no es 12");
        }
    }
}

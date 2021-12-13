package UNIDAD1.TAREA3;

import java.util.Scanner;

public class ej1_sumadosnumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        byte n1 = teclado.nextByte();

        System.out.println("Introduce otro número");
        byte n2 = teclado.nextByte();

        byte suma = (byte) (n1 + n2);

        System.out.println("La suma de " + n1 + " más " + n2 + " es " + suma);
    }
}

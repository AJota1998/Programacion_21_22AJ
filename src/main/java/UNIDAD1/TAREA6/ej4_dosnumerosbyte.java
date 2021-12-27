package UNIDAD1.TAREA6;

import java.util.Scanner;

public class ej4_dosnumerosbyte {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número pequeño");
        byte n1 = teclado.nextByte();

        System.out.println("Introduce otro número pequeño");
        byte n2 = teclado.nextByte();

        byte menor;

        if (n1 > n2) {
            menor = n2;
        } else {
            menor = n1;
        }

        System.out.println("El menor es: " + menor);
    }
}

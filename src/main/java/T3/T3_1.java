package T3;

import java.util.Scanner;

public class T3_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        byte n1 = teclado.nextByte();

        System.out.println("Introduce otro numero");
        byte n2 = teclado.nextByte();

        int op = (n1 + n2);

        System.out.println("El resultado es " + op);

    }
}

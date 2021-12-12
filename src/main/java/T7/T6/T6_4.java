package T7.T6;

import java.util.Scanner;

public class T6_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número typo byte (-127 a 128)");
        byte n1 = teclado.nextByte();

        System.out.println("Introduzca otro número typo byte (-127 a 128");
        byte n2 = teclado.nextByte();

        byte menor;
        if (n1 > n2) {
            menor = n2;
        } else
            menor = n1;
        System.out.println("El menor número de los introducidos es " + menor);
    }
}

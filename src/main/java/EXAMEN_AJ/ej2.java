package EXAMEN_AJ;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        long numero = teclado.nextLong();

        long aux;
        long cifra = 0;
        long inverso = 0;
        aux = numero;

        while (aux != 0) {
            cifra = aux % 10;
            inverso = (inverso * 10) + cifra;
            aux = aux / 10;
            }
    }
}

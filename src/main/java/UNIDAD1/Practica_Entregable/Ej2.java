package UNIDAD1.Practica_Entregable;

import java.util.Scanner; //numero capicúa

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        long n = teclado.nextLong();
        long aux = 0;
        long inverso = 0;
        long cifra;

        aux = n;
        while (aux != 0) {
            System.out.println("auxiliar vale " + aux);
            cifra = aux % 10;
            inverso = (inverso * 10) + cifra;
            aux = aux / 10;
            System.out.println("cifra vale " + cifra);
            System.out.println("inverso vale " + inverso);
            System.out.println("aux vale ahora " + aux);
            System.out.println("Siguiente interacción");
            System.out.println();
            }

        if (n == inverso) {
            System.out.println("Es capicua");
        } else System.out.println("No es capicua");
    }

}

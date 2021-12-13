package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej14_piramiderellenafacil {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca 0 para vertice hacia abajo,\n1 hacia arriba, 2 hacia izq y 3 hacia derecha: ");
        int vertice = teclado.nextInt();

        if (vertice == 0) {
            System.out.println("*****");
            System.out.println(" *** ");
            System.out.println("  *  ");
        } else if (vertice == 1) {
            System.out.println("  *  ");
            System.out.println(" *** ");
            System.out.println("*****");
        } else if (vertice == 2) {
            System.out.println("  *");
            System.out.println(" **");
            System.out.println("***");
            System.out.println(" **");
            System.out.println("  *");
        } else if (vertice == 3) {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        }
    }
}

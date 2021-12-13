package UNIDAD1.TAREA2;

import java.util.Scanner;

public class ej3_2numerosdivision {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int n1 = teclado.nextInt();

        System.out.println("Introduce otro número entero");
        int n2 = teclado.nextInt();

        System.out.println("La división de " + n1 + " entre " + n2 + " es " + (n1/n2));
    }
}

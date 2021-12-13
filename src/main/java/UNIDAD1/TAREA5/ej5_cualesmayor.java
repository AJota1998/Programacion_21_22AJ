package UNIDAD1.TAREA5;

import java.util.Scanner;

public class ej5_cualesmayor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero largo");
        long n1 = teclado.nextLong();

        System.out.println("Introduce otro número entero largo");
        long n2 = teclado.nextLong();

        System.out.println("Introduce otro número entero largo");
        long n3 = teclado.nextLong();

        long largo = 0;

        if (n1 > n2 && n2 > n3) {
            largo = n1;
        } else if (n2 > n1 && n2 > n3) {
            largo = n2;
        } else {
            largo = n3;
        }
        System.out.println("El mayor es " + largo);
    }
}

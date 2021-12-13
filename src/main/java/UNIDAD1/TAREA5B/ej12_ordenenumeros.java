package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej12_ordenenumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int n1 = teclado.nextInt();

        System.out.println("Introduzca un número");
        int n2 = teclado.nextInt();

        System.out.println("Introduzca un número");
        int n3 = teclado.nextInt();

        System.out.println("El mayor de los 3 es " + mayor(n1,n2,n3));

    }
    static int mayor (int n1, int n2, int n3) {
        int mayor = 0;
        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        }
        if (n2 > n1 && n2 > n3) {
            mayor = n2;
        }

        if (n3 > n2 && n3 > n1) {
            mayor = n3;
        }
        return mayor;
    }
}

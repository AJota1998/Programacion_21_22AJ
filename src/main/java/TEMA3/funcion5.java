package TEMA3;

import java.util.Scanner;

public class funcion5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int n2 = teclado.nextInt();

        System.out.println("Introduce un tercer número");
        int n3 = teclado.nextInt();

        System.out.println("El número mayor de los 3 es " + mayor(mayor(n1,n2), n3));
    }

    static int mayor(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}

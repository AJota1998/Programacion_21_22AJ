package T1.TEMA3;

import java.util.Scanner;

public class funcion4 {
    public static void main(String[] args) {

        Scanner teclado  = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int n2 = teclado.nextInt();

        System.out.println("El mayor de los dos es " + mayor(n1, n2));

    }
    static int mayor (int n1, int n2) {

        return n1 > n2 ? n1 : n2; // Con "? x : y;" esto devuelve uno, sino el otro
    }
}

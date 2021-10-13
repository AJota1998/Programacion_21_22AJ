package T5;

import java.util.Scanner;

public class T5_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int n1 = teclado.nextInt();

        System.out.println("Introduce otro número entero");
        int n2 = teclado.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("Los dos número son pares");
        } else if (n1 % 2 == 0 || n2 % 2 == 0) {
            System.out.println("Hay un número par");
        } else
            System.out.println("No hay ningún número par");
    }
}

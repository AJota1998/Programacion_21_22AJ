package T5;

import java.util.Scanner;

public class T5_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else
            System.out.println("Es impar");
    }
}

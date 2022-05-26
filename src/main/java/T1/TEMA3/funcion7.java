package T1.TEMA3;

import java.util.Scanner;

public class funcion7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        System.out.println("El número " + numero + " es primo " + es_primo(numero));

    }
    static boolean es_primo (int numero) {
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}

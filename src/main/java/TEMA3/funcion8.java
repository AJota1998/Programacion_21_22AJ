package TEMA3;

import java.util.Scanner;

public class funcion8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int n = teclado.nextInt();


    }
    static boolean es_primo (int n) {
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
    static boolean es_divisor (int n) {
        boolean divisor = false;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divisor = true;
            }
        }
        return divisor;
    }
}

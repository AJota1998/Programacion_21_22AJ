package UTILIDADES;

import java.util.Scanner;

public class SIPRIMO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número ");
        int n = teclado.nextInt();


        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(n + " Es primo");
        } else {
            System.out.println(n + " No es primo");
        }
    }
}



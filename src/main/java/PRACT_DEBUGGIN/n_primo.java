package PRACT_DEBUGGIN;

import java.util.Scanner;

public class n_primo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el núemero");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
    }

    public static boolean esPrimo(int num) {

        boolean esPrimo = true;
        for (int i = 2; i < num; i++) { //con este for se determina si el número es primo o no
            if (num % i == 0) {
                esPrimo = false;
                break;
            } else {
                esPrimo = true;
            }
        }
        return esPrimo;
    }

}

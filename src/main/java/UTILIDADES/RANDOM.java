package UTILIDADES;

import java.util.Scanner;

public class RANDOM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = (int) (1 + (Math.random() * 99));
        System.out.println(n);
    }
}

package PRACT_DEBUGGIN;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores de " + num);
        i = num;

        while (i < num + 10) {
            i++;
            System.out.println("Número posterior " + i);
        }
    }
}

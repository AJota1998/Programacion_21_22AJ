package UDEMY;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 10");
        int valor = teclado.nextInt();

        while (valor < 0 || valor > 10) {
            System.out.println("Introduce un dígito válido");
            valor = teclado.nextInt();
        }
        if (valor < 6) {
            System.out.println("F");
        } else if (valor == 7) {
            System.out.println("D");
        } else if (valor == 8) {
            System.out.println("C");
        } else if(valor == 9){
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}

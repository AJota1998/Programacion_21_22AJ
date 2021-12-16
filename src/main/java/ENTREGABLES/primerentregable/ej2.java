package ENTREGABLES.primerentregable;

import java.util.Scanner;

public class ej2 { //Estoy a punto de verlo, pero no se si está bien del todo

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        long n = teclado.nextLong();

        System.out.println("Introduce el numero de saltos");
        int saltos = teclado.nextInt();
            while (saltos < 0 || saltos > 2) {
                System.out.println("Introduce un número de saltos válidos");
            }

        do {
            if (saltos == 0) {
                saltos = 1;
            } else {
                saltos--;
            }
            n = n / 10;

        } while (n != 0);
        System.out.println(n);


    }
}

package ENTREGABLES.primerentregable;

import java.util.Scanner;

public class ej1 { //Ahora mismo no soy capaz de hacer esto, pero seguiré trabajando para conseguirlo.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        int altura = teclado.nextInt();

        while (altura < 3 || altura % 2 != 0) {
            System.out.println("Introduce una altura válida");
        }



    }
}

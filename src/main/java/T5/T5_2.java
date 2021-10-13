package T5;

import java.util.Scanner;

public class T5_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número 12, por favor");
        int numero = teclado.nextInt();

        if (numero == 12) {
            System.out.println("Correcto");
        } else
            System.out.println("Incorrecto");
    }
}

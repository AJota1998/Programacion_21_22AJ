package T2;

import java.util.Scanner;

public class T2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una longitud en millas");
        double valor = teclado.nextDouble();

        final double metro = 1.609;
        double operacion = (metro * valor);

        System.out.println(operacion + " metros");
    }
}

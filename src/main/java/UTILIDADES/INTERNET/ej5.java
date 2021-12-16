package UTILIDADES.INTERNET;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca el radio");
        int radio = teclado.nextInt();

        final double numero_pi = 3.14;

        double area = (numero_pi * (radio * radio));
        System.out.println("El área es " + area);
    }
}

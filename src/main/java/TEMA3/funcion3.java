package TEMA3;

import java.util.Scanner;

public class funcion3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 1 para área, 2 para volumen");
        int numero = teclado.nextInt();
        System.out.println("Introduce el radio");
        int radio = teclado.nextInt();
        System.out.println("Introduce la altura");
        int altura = teclado.nextInt();

        System.out.println(calculo(numero, radio, altura));

    }
    static double calculo (int numero, int radio, int altura) {
        if (numero == 1) {
            double r1 = (2 * 3.14 * radio) * (altura + radio);
            return r1;
        } else {
            double r2 = (3.14 * radio * (3.14 * radio)) * altura;
            return r2;
        }
    }
}
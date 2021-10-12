package T6;

import java.util.Scanner;

public class T6_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia");
        double radio = teclado.nextDouble();
        final double pi = Math.PI;

        System.out.println("Qué desea saber: 1-Calcular diámetro 2-Calcular perímetro \n 3-Calcular área");
        int calculo = teclado.nextInt();

        if (calculo == 1) {
            System.out.println("El diametro es " + (radio *2));
        } else if (calculo == 2) {
            System.out.println("El perímeto es " + ((2 * pi) * radio));
        } else if (calculo == 3) {
            System.out.println("El área es " + ((pi * radio) * radio));
        } else System.out.println("Error");
    }
}

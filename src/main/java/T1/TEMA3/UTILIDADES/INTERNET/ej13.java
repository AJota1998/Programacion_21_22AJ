package T1.TEMA3.UTILIDADES.INTERNET;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número de ventas realizadas este trimestre");
        int num_ventas = teclado.nextInt();

        int bucle = 0;
        int []ventas = new int[num_ventas];

        while (bucle != num_ventas) {
            System.out.println("Introduce la cantidad de la venta número " + (bucle + 1));
            ventas[bucle] = teclado.nextInt();
            bucle++;
        }

        for (int imprime: ventas) {
            System.out.println(imprime);
        }
    }
}


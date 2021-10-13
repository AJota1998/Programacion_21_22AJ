package T3;

import java.util.Scanner;

public class T3_4 {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduzca una longitud en millas");
            double valor = teclado.nextDouble();

            final double km = 1.609;
            double operacion = (km * valor);

            System.out.println(operacion + " kilómetros");
        }
    }


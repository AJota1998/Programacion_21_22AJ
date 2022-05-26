package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class LOTERIA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduzca su primer número favorito: ");

        int num1 = teclado.nextInt();

        while (num1 > 9 || num1 < 0) {
            System.out.println("ERROR - Vuelva a introducir su primer numero favorito: ");
            num1 = teclado.nextInt();
        }

        System.out.println("Introduzca su segundo número favorito: ");
        int num2 = teclado.nextInt();

        while (num2 > 9 || num2 < 0 || num2 == num1) {
            System.out.println("ERROR - Vuelva a introducir su segundo numero favorito");
            num2 = teclado.nextInt();
        }

        System.out.println("Introduzca su tercer número favorito: ");
        int num3 = teclado.nextInt();

        while (num3 > 9 || num3 < 0 || num3 == num1 || num3 == num2 ) {
            System.out.println("ERROR - Vuelva a introducir su tercer número favorito");
            num3 = teclado.nextInt();
        }

        System.out.print("Introduzca el número de la loteria: ");

        int numl = teclado.nextInt();

        while ( numl > 99999 || numl < 10000 ) {
            System.out.println("ERROR - Vuelva a introducir el número de la loteria");
            numl = teclado.nextInt();
        }

        int cociente = numl;
        int resto;
        int contador = 0;

        while (cociente > 0) {
            resto = cociente % 10;
            if (resto == num1 || resto == num2 || resto == num3) {
                contador++;
            }
            cociente = cociente / 10;
        }

        if (contador > 2) {
            System.out.println("Ese número le va a dar suerte");
        } else {
            System.out.println("Ese numero no le va a dar suerte");
        }
    }
}

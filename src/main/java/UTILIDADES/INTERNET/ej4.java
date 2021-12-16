package UTILIDADES.INTERNET;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un nombre");
        String nombre = teclado.next();

        String nombrecompuesto = "Fernando";

        System.out.println("El nombre compuesto es " + nombre +  " " + nombrecompuesto);
    }
}

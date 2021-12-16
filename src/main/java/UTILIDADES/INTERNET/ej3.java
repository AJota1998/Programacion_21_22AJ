package UTILIDADES.INTERNET;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introducza un nombre");
        String nombre = teclado.next();

        System.out.println("El nombre introducido es " + nombre);
    }
}

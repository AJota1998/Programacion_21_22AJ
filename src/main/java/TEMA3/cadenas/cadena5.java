package TEMA3.cadenas;

import java.util.Scanner;

public class cadena5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca nombre y apellido");
        String nombre = teclado.nextLine();
        String nombresin = "Nombre: ";

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if ((letra == 'a') || (letra == 'A') || (letra == 'e')
            || (letra == 'E') || (letra == 'i') || (letra == 'I') ||
            (letra == 'o') || (letra == 'O') || (letra == 'u') ||
            (letra == 'U')) {
            nombre = nombre;
            } else {
                nombresin += letra;
            }
        }
        System.out.println(nombresin);
    }
}

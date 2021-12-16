package UTILIDADES.INTERNET;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un carácter");
        char caracter = teclado.next().charAt(0);

        int digito = (int) caracter;

        System.out.println("El dígito númerico es " + digito);



    }
}

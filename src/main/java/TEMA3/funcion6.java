package TEMA3;

import java.util.Scanner;

public class funcion6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una letra");
        String letra = teclado.next();

        System.out.println("La letra " + letra + " es " + vocal(letra));

    }
    static boolean vocal(String letra) {
        boolean sivocal = false;
        if ((letra.equalsIgnoreCase("a")
            || (letra.equalsIgnoreCase("e"))
            || (letra.equalsIgnoreCase("i"))
            || (letra.equalsIgnoreCase("o"))
            || (letra.equalsIgnoreCase("u")))) {
                sivocal = true;
        }
        return sivocal;
    }
}

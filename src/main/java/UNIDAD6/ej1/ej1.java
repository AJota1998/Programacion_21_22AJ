package UNIDAD6.ej1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el nombre del fichero");
        String fichero = teclado.nextLine();

        if (fichero.equals("")) {
            fichero = "ficheros/prueba.txt";
        }

        String texto = "";

        try {
            FileReader in = new FileReader(fichero);
            int c = in.read();
            while (c != - 1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println(texto);
    }
}

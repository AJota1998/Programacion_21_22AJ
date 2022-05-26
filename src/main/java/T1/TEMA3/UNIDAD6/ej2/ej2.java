package T1.TEMA3.UNIDAD6.ej2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String nombre = teclado.nextLine();

        System.out.println("Introduzca su edad");
        String edad = teclado.nextLine();

        try {
            FileWriter in = new FileWriter("ficheros/datos.txt", true);
            in.write("Nombre " + nombre);
            in.write(" Edad " + edad);
            in.write("\n");
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

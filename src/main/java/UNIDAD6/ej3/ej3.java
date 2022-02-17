package UNIDAD6.ej3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String valor = "";

        try {
            FileWriter in = new FileWriter("ficheros/original.txt");
            in.write("Hola que tal");
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(valor);

        try {
            FileReader in = new FileReader("ficheros/original.txt");
            int c = in.read();
            while (c != - 1) {
                valor += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("El fichero contiene: " + valor);

        try {
            FileWriter in = new FileWriter("ficheros/copia.txt");
            in.write("Hola que tal");
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(valor);

        try {
            FileReader in = new FileReader("ficheros/copia.txt");
            int c = in.read();
            while (c != - 1) {
                valor += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("El fichero contiene: " + valor);

        //copia

        String valor2 = "";

        System.out.println("Introduzca el nombre del fichero");
        String fichero = teclado.nextLine();

        try {
            FileWriter in = new FileWriter("ficheros/"+fichero);
            in.write(fichero);
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(valor2);

        try {
            FileReader in = new FileReader("ficheros/"+fichero);
            int c = in.read();
            while (c != - 1) {
                valor2 += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("El fichero contiene: " + valor2);

    }
}

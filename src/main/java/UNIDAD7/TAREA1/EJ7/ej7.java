package UNIDAD7.TAREA1.EJ7;
//Introducir por teclado, hasta que se introduzca "fin",
//una serie de nombres que se insertarán por orden alfabético en una colección que no permita repeticiones.
//mostrar luego la lista de nombres por pantalla.

import java.util.Scanner;
import java.util.TreeSet;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = " ";
        TreeSet<String> lista_nombres = new TreeSet<>();

        do {
            System.out.println("Introduzca un nombre");
            nombre = teclado.next();
            if(!nombre.equalsIgnoreCase("fin")) {
                lista_nombres.add(nombre);
            }
        } while(!nombre.equalsIgnoreCase("fin"));

        System.out.println(lista_nombres);

    }
}

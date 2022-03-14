package UNIDAD7.TAREA1.EJ6;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en una colección,
//de forma que se conserve el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.
public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = " ";
        Set<String> lista_nombres = new LinkedHashSet<>();

        while (!nombre.equalsIgnoreCase("fin")) {
            System.out.println("Introduzca un nombre");
            nombre = teclado.next();
            if(!nombre.equals("fin")) {
                lista_nombres.add(nombre);
            }
        }

        System.out.println(lista_nombres);

    }
}

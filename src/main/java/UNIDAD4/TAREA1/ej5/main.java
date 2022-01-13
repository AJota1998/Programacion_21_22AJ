package UNIDAD4.TAREA1.ej5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la longitud máxima de la cadena");
        int longitud = teclado.nextInt();

        texto max_long = new texto(longitud);

        System.out.println("Introduzca el caracter a añadir");
        String anadir = teclado.next();

        System.out.println("Para posicionar delante introduzca inicio, para posicional al final fin");
        String posicion = teclado.next();

        System.out.println("Introduzca la cadena a añadir");
        String anadir2 = teclado.next();

        System.out.println("Para posicionar delante introduzca inicio, para posicional al final fin");
        String posicion2 = teclado.next();




    }
}

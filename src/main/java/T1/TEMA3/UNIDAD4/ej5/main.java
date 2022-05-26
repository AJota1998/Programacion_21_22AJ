package T1.TEMA3.UNIDAD4.ej5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la longitud máxima de la cadena");
        int longitud = teclado.nextInt();

        // creamos el objeto
        texto c1 = new texto(longitud);

        // añadir el caracter
        System.out.println("Para posicionar delante introduzca inicio, para posicionar al final fin");
        String posicion = teclado.next();

        System.out.println("Introduzca el caracter a añadir");
        char caracter = teclado.next().charAt(0);
        c1.add(caracter, posicion);

        // añadir la cadena
        System.out.println("Para posicionar delante introduzca inicio, para posicionar al final fin");
        String posicion2 = teclado.next();

        System.out.println("Introduzca la cadena a añadir");
        String cadena = teclado.next();
        c1.add2(cadena, posicion2);

        c1.vocales();


    }
}

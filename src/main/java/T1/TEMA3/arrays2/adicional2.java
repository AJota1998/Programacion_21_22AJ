package T1.TEMA3.arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class adicional2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String []colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String []colores_usuario = new String[8];
        String []palabras_usuario = new String[8];

        int posicioncolores= 0;
        int posicionpalabras = 0;
        int bucle = 0;

         while (bucle != 8) {

             bucle++;
             System.out.println("Introduce una palabra");
             String dato = teclado.next();

             if ((dato.equalsIgnoreCase("verde")) || (dato.equalsIgnoreCase("rojo"))
             || (dato.equalsIgnoreCase("azul")) || (dato.equalsIgnoreCase("amarillo"))
             || (dato.equalsIgnoreCase("naranja")) || (dato.equalsIgnoreCase("rosa"))
             || (dato.equalsIgnoreCase("negro")) || (dato.equalsIgnoreCase("blanco"))
             || (dato.equalsIgnoreCase("morado"))) {
                 colores_usuario[posicioncolores] = dato;
                 palabras_usuario = Arrays.copyOf(palabras_usuario, palabras_usuario.length -1);
                 posicioncolores++;
             } else {
                 palabras_usuario[posicionpalabras] = dato;
                 colores_usuario = Arrays.copyOf(colores_usuario, colores_usuario.length - 1);
                 posicionpalabras++;
             }
        }
        for (int i = 0; i < colores_usuario.length; i++) {
            System.out.println(colores_usuario[i]);
        }
        System.out.println();
        for (int i = 0; i < palabras_usuario.length; i++) {
            System.out.println(palabras_usuario[i]);
        }
    }
}

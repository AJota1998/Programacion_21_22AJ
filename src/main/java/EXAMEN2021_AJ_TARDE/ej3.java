package EXAMEN2021_AJ_TARDE;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {

       //creo la cadena denomida hola
        String cadena = "hola";

        //aquí llamaríamos a la funcion para imprimirla
        System.out.println(Arrays.toString(invertir(cadena)));

        //aquí llamaríamos a la segunda función para imprimirla
        System.out.println(desplazarVocales(cadena));

    }
    public static String[] invertir(String cadena) {

        //convierto la cadena a StringBuilder para utilizar un método llamado reverse
        StringBuilder inverso = new StringBuilder(cadena);
        StringBuilder vuelta = inverso.reverse();

        //Creo un String con la longitud de la palabra
        String [] rev = new String[4];
        char letra;

        //recorro con un bucle la cadena vuelta e intento introducir su caracter de la posicion i en el String rev
        for (int i = 0; i < vuelta.length(); i++) {
            letra = vuelta.charAt(i);

        }
        return rev;
    }

    public static String[] desplazarVocales(String cadena) {
        String[] vocales = new String[0];
        return vocales;
    }
}

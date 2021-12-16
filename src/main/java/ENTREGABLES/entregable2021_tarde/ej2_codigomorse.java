package ENTREGABLES.entregable2021_tarde;

import java.util.Arrays;

public class ej2_codigomorse {
    public static void main(String[] args) {

       int numero = 234;

        System.out.println("El número " + numero + " en codigo morse es " + convierteEnMorse(numero));

    }
    public static String convierteEnMorse (int numero) {

        String n2 = String.valueOf(numero);
        String resuelto = "";

        for (int i = 0; i < n2.length(); i++) {
            char caracter = n2.charAt(i);
            switch (caracter) {
                case '1':
                    resuelto = resuelto.concat(".----");
                    break;
                case '2':
                    resuelto = resuelto.concat("..---");
                    break;
                case '3':
                    resuelto = resuelto.concat("...--");
                    break;
                case '4':
                    resuelto = resuelto.concat("...-");
                    break;
                case '5':
                    resuelto = resuelto.concat(".....");
                    break;
                case '6':
                    resuelto = resuelto.concat("-....");
                    break;
                case '7':
                    resuelto = resuelto.concat("--...");
                    break;
                case '8':
                    resuelto = resuelto.concat("---..");
                    break;
                case '9':
                    resuelto = resuelto.concat("----.");
                    break;
                case '0':
                    resuelto = resuelto.concat("-----");
                    break;
            }
        }
        return resuelto;
    }
}

package TEMA3.cadenas;

import java.util.Scanner;

public class cadena8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el mensaje");
        String mensaje = teclado.nextLine();
        int logi_mensaje = mensaje.length();

        String mensajelimpio = " ";
        String inicio = " Javalín, javalón ";
        String fin = "Javalén, len, len";

        int longi_fin = fin.length();

        String comparado = mensaje.substring(0,18);

        String compfin = mensaje.substring(19, mensaje.length());

        if (comparado.equals(inicio)) {
            mensajelimpio = mensaje.substring(19, mensaje.length());
        }
        if (compfin.equals(fin)) {
            mensajelimpio = mensaje.substring(0, logi_mensaje-longi_fin);
        }
    }
}

package EXAMEN2021_AJ_TARDE;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //solicito al usuario que introduzca un número de varias cifras
        System.out.println("Introduce un número de varias cifras");
        int n = teclado.nextInt();

        //imprimo el número pasado a string llamando a la funcion
        System.out.println(convierteEnPalabras(n));

    }
    public static String convierteEnPalabras(int n) {

        //paso el entero a cadena para comprobar digito a dígito
        String numero = Integer.toString(n);
        //creo un conversor donde almacenar los dígitos transformados
        String conversor = "";

        //creo un bucle que recorre la cadena y con condicioales establezco estas condiciones

        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '1') {
                conversor = conversor.concat(" uno,");
            } else if (numero.charAt(i) == '2') {
                conversor = conversor.concat(" dos,");
            } else if (numero.charAt(i) == '3') {
                conversor = conversor.concat(" tres,");
            } else if (numero.charAt(i) == '4') {
                conversor = conversor.concat(" cuatro,");
            }else if (numero.charAt(i) == '5') {
                conversor = conversor.concat(" cinco,");
            } else if (numero.charAt(i) == '6') {
                conversor = conversor.concat(" seis,");
            } else if (numero.charAt(i) == '7')  {
                conversor = conversor.concat(" siete,");
            } else if (numero.charAt(i) == '8') {
                conversor = conversor.concat(" ocho,");
            } else if (numero.charAt(i) == '9') {
                conversor = conversor.concat(" nueve,");
            } else if (numero.charAt(i) == '0') {
                conversor = conversor.concat(" cero,");
            }
        }
        //devuelvo el String
         return conversor;
    }
}


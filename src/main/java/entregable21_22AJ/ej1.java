package entregable21_22AJ;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        String palabra = "programacion";
        String resultado = "------------";
        char caracter = 'o';
        Scanner sc = new Scanner(System.in);

        System.out.println(resultado);

        while (resultado.contains("-")) {
            System.out.print("¿Qué carácter quieres buscar?: ");
            caracter = sc.next().charAt(0);
            resultado = palabraAhorcado(palabra, resultado, caracter);
            System.out.println(resultado);
        }
        System.out.println("¡Has ganado!");
    }

    public static String palabraAhorcado(String a, String b, char c) {
        StringBuilder sb = new StringBuilder(b);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                sb.setCharAt(i, c);
            }
        }
        return sb.toString();
    }
}
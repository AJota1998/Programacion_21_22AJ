package TEMA3.cadenas;

import java.util.Scanner;

public class cadena7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Utilizamos nextline cuando queremos pillar una frase.

        System.out.println("Vamos a jugar a adivinar la constraseña");
        System.out.println("Jugador 1, introduce la contraseña");
        String pass1 = teclado.nextLine();
        int longitud = pass1.length();

        System.out.println("---Pistas---");
        System.out.println("Primera letra " + pass1.charAt(0));
        System.out.println("Última letra " + pass1.charAt(longitud - 1));

        System.out.println("Jugador 2, introduce la contraseña");
        String pass2 = teclado.nextLine();
        int longitud2 = pass2.length();

        if (pass1.equals(pass2)) {
            System.out.println("Acertarse, enhorabuena");
        } else if (longitud < longitud2) {
            System.out.println("Fallaste, es menor");
        } else if (longitud > longitud2) {
            System.out.println("Fallaste, es mayor");
        }
    }
}

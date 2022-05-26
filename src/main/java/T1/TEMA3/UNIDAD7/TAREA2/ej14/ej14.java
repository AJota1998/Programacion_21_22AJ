package T1.TEMA3.UNIDAD7.TAREA2.ej14;

/* Implementar la función leeCadena con el siguiente prototipo:
        List<Character> leeCadena()
Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase pequeña");
        String cadena = teclado.nextLine();

        System.out.println(cadena);
        System.out.println(lea_cadena(cadena));

    }
    public static List<Character> lea_cadena(String cad) {
        ArrayList<Character> cadenita = new ArrayList<>();
        for (int i = 0; i < cad.length(); i++) {
            cadenita.add(cad.charAt(i));
        }
        return cadenita;
    }
}

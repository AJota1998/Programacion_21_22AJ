package UNIDAD7.EJ4;

import java.util.ArrayList;
import java.util.Collections;

public class EJ4 {
    public static void main(String[] args) {

        String frase = "Hola buenas tardes señor hola señor";
        int indice = 0;
        frase = frase.concat(" ");

        System.out.println("---FRASE---");
        System.out.println(frase);
        System.out.println("---LISTA DE PALABRAS---");

        ArrayList<String> Palabras = new ArrayList<>();

        for (int i = 0; i < frase.length(); i++) {
            Character caracter = frase.charAt(i);
                if(caracter.toString().equals(" ")) {
                    Palabras.add(frase.substring(indice, i));
                    indice = i + 1;
                }
        }

        imprimir(Palabras);

        ArrayList<String> repetidas = new ArrayList<>();
        ArrayList<String> no_repetidas = new ArrayList<>();

        for (int i = 0; i < Palabras.size(); i++) {
            if(Collections.frequency(no_repetidas, Palabras.get(i)) == 0) {
                no_repetidas.add(Palabras.get(i));
            } else {
                repetidas.add(Palabras.get(i));
            }
        }

        System.out.println("---REPETIDAS---");
        imprimir(repetidas);
        System.out.println("---NO REPETIDAS---");
        imprimir(no_repetidas);


    }
    //funcion imprimir, es static porque está fuera del main
    public static void imprimir(ArrayList<String> nombre) {
        for (String imprimir: nombre) {
            System.out.println(imprimir);
        }
    }
}


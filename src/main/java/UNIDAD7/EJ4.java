package UNIDAD7;

import java.util.ArrayList;

public class EJ4 {
    public static void main(String[] args) {

        String frase = "Hola caballero adios caballero";
        int indice = 0;
        frase = frase.concat(" ");

        System.out.println(frase);
        System.out.println();

        ArrayList<String> Palabras = new ArrayList<>();

        for (int i = 0; i < frase.length(); i++) {
            Character caracter = frase.charAt(i);
                if(caracter.toString().equals(" ")) {
                    Palabras.add(frase.substring(indice, i));
                    indice = i + 1;
                }
        }

        for (String imprimir: Palabras) {
            System.out.println(imprimir);
        }
    }
}


package UNIDAD7.TAREA3B.ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Traductor {

    HashMap<String, String> diccionario;

    public Traductor(String ruta) {
        this.diccionario = new HashMap<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(ruta));
            String linea = in.readLine();

            while (linea != null) {
                String[] array_string = linea.split(", ");
                diccionario.put(array_string[0], array_string[1]);
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(diccionario);
    }

    public String traduce(String palabra) {
        return diccionario.get(palabra);
    }

    public void imprime() {
        System.out.println("\nrecorrer mediante entry");
        for (Map.Entry entry : diccionario.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " valor: " + entry.getValue());
        }
    }

    public String traduce_frase(String frase) {
        frase = frase.concat(" ");
        ArrayList<String> palabras = new ArrayList<>();
        int indice = 0;
        for (int i = 0; i < frase.length(); i++) {
            Character carac = frase.charAt(i);
            if(carac.toString().equalsIgnoreCase(" ")) {
                    palabras.add(frase.substring(indice, i));
                    indice = i + 1;
            }
        }
        String frasefinal = "";

        for (String p: palabras) {
            frasefinal += (diccionario.get(p) + " ");
        }
        return frasefinal;
    }
}

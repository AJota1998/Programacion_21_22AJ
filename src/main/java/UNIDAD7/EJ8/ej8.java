package UNIDAD7.EJ8;

import java.util.*;

public class ej8 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("juan");
        lista.add("manuel");
        lista.add("manuel");
        lista.add("rocio");
        lista.add("rosa");
        lista.add("juan");
        lista.add("alberto");

        System.out.println("LISTA NORMAL");
        System.out.println(lista);
        System.out.println("LISTA SIN REPETIDOS");
        elimina_repetidos(lista);


    }
    public static List elimina_repetidos(List c) {
        LinkedHashSet lista_sin_rep = new LinkedHashSet(c);

        return (List) lista_sin_rep;
    }
}

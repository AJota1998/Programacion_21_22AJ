package UNIDAD7.TAREA2.eJ10;

import java.util.LinkedHashSet;
import java.util.Set;

public class ej10 {
    public static void main(String[] args) {

        Set<String> conjunto1 = new LinkedHashSet<>();
        Set<String> conjunto2 = new LinkedHashSet<>();

        conjunto1.add("Hola");
        conjunto1.add("caballero");
        conjunto1.add("adio");
        conjunto1.add("señor");
        conjunto1.add("feo");

        conjunto2.add("Hola");
        conjunto2.add("caballero");
        conjunto2.add("adios");
        conjunto2.add("señora");

        System.out.println(conjunto1);
        System.out.println(conjunto2);
        System.out.println(interseccion(conjunto1, conjunto2));
    }
    public static Set interseccion (Set<String> conjunto1, Set<String> conjunto2) {
        Set<String> conjuntofinal = new LinkedHashSet<>();
        conjunto1.retainAll(conjunto2);
        conjuntofinal.add(String.valueOf(conjunto1));

        return conjuntofinal;
    }
}

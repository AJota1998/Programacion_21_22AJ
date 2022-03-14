package UNIDAD7.TAREA2.ej9;

import java.util.LinkedHashSet;
import java.util.Set;

public class ej9 {
    public static void main(String[] args) {

        Set<String> conjunto1 = new LinkedHashSet<>();
        Set<String> conjunto2 = new LinkedHashSet<>();

        conjunto1.add("Hola");
        conjunto1.add("caballero");
        conjunto1.add("adio");
        conjunto1.add("señor");
        conjunto1.add("feo");

        conjunto2.add("Gracias");
        conjunto2.add("por");
        conjunto2.add("su");
        conjunto2.add("amabilidad");

        System.out.println(conjunto1);
        System.out.println("\n" + conjunto2);

        System.out.println(union(conjunto1, conjunto2));

    }
    public static Set union (Set<String> conjunto1, Set<String> conjunto2) {
        Set<String> conjuntofinal = new LinkedHashSet<>();

        conjuntofinal.addAll(conjunto1);
        conjuntofinal.addAll(conjunto2);

        return conjuntofinal;
    }
}

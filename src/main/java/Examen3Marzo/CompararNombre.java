package Examen3Marzo;

import java.util.Comparator;

public class CompararNombre implements Comparator {
    @Override
    public int compare(Object objeto1, Object objeto2) {
        AgrupacionOficial agrup1 = (AgrupacionOficial) objeto1;
        AgrupacionOficial agrup2 = (AgrupacionOficial) objeto2;

        return (agrup1.getNombre().compareTo(agrup2.getNombre()));
    }
}

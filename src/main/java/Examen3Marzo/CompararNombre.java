package Examen3Marzo;

import ZZZPRACTICAS.ENTREGABLE_24F.Multimedia;

import java.util.Comparator;

public class CompararNombre implements Comparator {
    @Override
    public int compare(Object objeto1, Object objeto2) {
        AgrupacionOficial agrup1 = (AgrupacionOficial) objeto1;
        Multimedia multimedia2 = (Multimedia) objeto2;

        return (AgrupacionOficial.getNombre().compareTo(multimedia2.getTitulo()));
    }
}

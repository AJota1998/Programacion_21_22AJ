package T1.TEMA3.Examen3Marzo;

import java.util.Comparator;

public class CompararPuntos {
    public class ComparadorPorTitulo implements Comparator {
        @Override
        public int compare(Object objeto1, Object objeto2) {
            AgrupacionOficial agrup1 = (AgrupacionOficial) objeto1;
            AgrupacionOficial agrup2 = (AgrupacionOficial) objeto2;

            return (agrup1.getPuntos_obtenidos().compareTo(agrup2.getPuntos_obtenidos()));
        }
    }
}

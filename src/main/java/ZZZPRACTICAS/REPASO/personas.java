package ZZZPRACTICAS.REPASO;

import java.util.Arrays;

public abstract class personas {

    protected int[] listaPersonas;
    protected int indice;

    public personas() {
        this.listaPersonas = new int[10];
        this.indice = 0;
    }

    public personas(int capacidad) {
        this.listaPersonas = new int[capacidad];
        this.indice = 0;
    }

    public void eliminaPornIndice(int ind) {

        int[] aux = new int[indice - 1];

        for (int i = 0; i < ind; i++) {
            aux[i] = listaPersonas[i];
        }
        for (int i = ind; i < indice - 1; i++) {
            aux[i] = listaPersonas[i + 1];
        }

        listaPersonas = Arrays.copyOf(aux, aux.length);

        indice--;
    }


}

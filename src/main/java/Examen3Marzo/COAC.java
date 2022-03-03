package Examen3Marzo;

import java.util.Arrays;

public class COAC {

    public COAC(AgrupacionOficial[] arrayAgrupaciones) {
        this.arrayAgrupaciones = arrayAgrupaciones;
    }

    AgrupacionOficial [] arrayAgrupaciones;
    private Integer indiceArray = 0;


    public Integer getIndiceArray() {
        return indiceArray;
    }

    public void setIndiceArray(Integer indiceArray) {
        this.indiceArray = indiceArray;
    }

    public void insertar_agrupacion(AgrupacionOficial agof) {
        this.arrayAgrupaciones = Arrays.copyOf(this.arrayAgrupaciones, this.arrayAgrupaciones.length + 1);
        this.arrayAgrupaciones[indiceArray] = agof;
        indiceArray++;
    }
    public boolean eliminar_agrupacion (AgrupacionOficial agof) {
        for (int i = 0; i < this.arrayAgrupaciones.length; i++) {
            if (agof.equals(arrayAgrupaciones[i])) {
                AgrupacionOficial [] Aux = Arrays.copyOfRange(this.arrayAgrupaciones, i + 1, this.arrayAgrupaciones.length);
                int numearoAux = i;
                for (int j = 0; j < Aux.length; j++) {
                    this.arrayAgrupaciones[numearoAux] = Aux[j];
                    numearoAux++;
                }
                this.arrayAgrupaciones = Arrays.copyOf(this.arrayAgrupaciones, this.arrayAgrupaciones.length - 1);
                indiceArray--;
                return true;
            }
        }
        System.out.println("La agrupacion no se encuentra.");
        return false;
    }

    @Override
    public String toString() {
        return "COAC{" +
                "arrayAgrupaciones=" + Arrays.toString(arrayAgrupaciones) +
                '}';
    }

    public void compararnombre () {
        Arrays.sort(this.arrayAgrupaciones);
    }
    public void compararPuntos () {
        Arrays.sort(this.arrayAgrupaciones);
    }
}

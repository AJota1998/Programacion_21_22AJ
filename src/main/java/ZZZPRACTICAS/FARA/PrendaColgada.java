package ZZZPRACTICAS.FARA;

public class PrendaColgada extends Prendas {

    private int alturabarra;

    public PrendaColgada(Double precio, String nombre, Integer codigoBarras, Integer peso, int alturabarra) {
        super(precio, nombre, codigoBarras, peso);
        this.alturabarra = alturabarra;
    }


}

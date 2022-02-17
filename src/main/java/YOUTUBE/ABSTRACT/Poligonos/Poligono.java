package YOUTUBE.ABSTRACT.Poligonos;

public abstract class Poligono {

    protected Integer n_lados;

    public Poligono(Integer n_lados) {
        this.n_lados = n_lados;
    }

    public Integer getN_lados() {
        return n_lados;
    }

    public void setN_lados(Integer n_lados) {
        this.n_lados = n_lados;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "número de lados=" + n_lados +
                '}';
    }

    public abstract Double area();
}

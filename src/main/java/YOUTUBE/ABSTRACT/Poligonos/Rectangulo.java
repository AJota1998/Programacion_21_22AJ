package YOUTUBE.ABSTRACT.Poligonos;

public class Rectangulo extends Poligono {

    private Double lado1;
    private Double lado2;

    //constructor
    public Rectangulo(Double lado1, Double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    //metodo heredado de poligono
    @Override
    public Double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "numero de lados=" + n_lados +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }
}

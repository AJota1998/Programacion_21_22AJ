package T1.TEMA3.YOUTUBE.ABSTRACT.Poligonos;

public class Triangulo extends Poligono {

    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "numero de lados=" + n_lados +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

    @Override
    public Double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
    }


}

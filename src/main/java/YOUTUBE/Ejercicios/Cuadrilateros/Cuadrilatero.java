package YOUTUBE.Ejercicios.Cuadrilateros;

public class Cuadrilatero {

    private float lado1;
    private float lado2;
    private float perimetro;
    private float area;

    //metodo constructor para cuadriláteros
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //metodo constructor para un cuadrado (todos los lados son iguales)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea() {
        area = lado1*lado2;
        return area;
    }
}

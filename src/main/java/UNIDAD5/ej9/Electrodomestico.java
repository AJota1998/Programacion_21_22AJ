package UNIDAD5.ej9;

public abstract class Electrodomestico {

    //Atributos
    protected Double preciobase;
    protected enum enumcol {
        blanco,
        negro,
        rojo,
        azul,
        gris
    }
    protected enumcol color;
    public enum enumcons {
        A,
        B,
        C,
        D,
        E,
        F
    }
    protected enumcons consumo;
    Double peso;

    //Métodos

    public Electrodomestico(Double preciobase, enumcol color, enumcons consumo, Double peso) {
        this.preciobase = preciobase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;

    }
    public Electrodomestico() {
        this.preciobase = 100.0;
        this.color = enumcol.blanco;
        this.consumo = enumcons.F;
        this.peso = 5.0;
    }
    public Electrodomestico(Double preciobase, Double peso) {
        this.preciobase = preciobase;
        this.peso = peso;
        this.color = enumcol.blanco;
        this.consumo = enumcons.F;

    }

    public Double getPreciobase() {
        return preciobase;
    }

    public enumcol getColor() {
        return color;
    }

    public enumcons getConsumo() {
        return consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getPrecio_final() {
        Double precio_final;
        if(consumo.equals(enumcons.A)) {
            precio_final = preciobase + 100.0;
        } else if(consumo.equals(enumcons.B)) {
            precio_final = preciobase + 80.0;
        } else if(consumo.equals(enumcons.C)) {
            precio_final = preciobase + 60.0;
        } else if(consumo.equals(enumcons.D)) {
            precio_final = preciobase + 50.0;
        } else if(consumo.equals(enumcons.E)) {
            precio_final = preciobase + 30.0;
        } else {
            precio_final = preciobase + 10.0;
        }
        if(peso >= 0 && peso <= 29) {
            precio_final += 10;
        } else if(peso > 29 && peso <= 49) {
            precio_final += 60;
        } else if(peso > 49 && peso <= 79) {
            precio_final += 80;
        } else if(peso >= 80) {
            precio_final += 100;
        }
        return precio_final;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "preciobase=" + preciobase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", precio_final=" + getPrecio_final() +
                '}';
    }
}

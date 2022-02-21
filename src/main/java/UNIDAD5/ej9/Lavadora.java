package UNIDAD5.ej9;

public class Lavadora extends Electrodomestico implements Comparable{

    protected Integer carga;

    //como Lavadora coge por defecto los atributos del constructor electrodomestico que se encuentra vacío, no es
    //necesario indicarlo con 'super', de haber una manera diferente a la de por defecto (vacío) de construir el objeto,
    //deberemos indicárselo.
    public Lavadora () {
         this.carga = 5;
    }

    //creamos otro constructor de Lavadora, y ahora llamamos a los atributos supre del padre
    public Lavadora(Double preciobase, Double peso) {
        super(preciobase, peso);
        this.carga = 5;
    }

    public Lavadora (Integer carga) {
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    @Override
    public Double getPrecio_final() {
        if (this.carga > 30) {
           return super.getPrecio_final() + 50.0;
        }
        return super.getPrecio_final();
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "preciobase=" + preciobase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", precio_final=" + getPrecio_final() +
                ", carga=" + carga +
                '}';
    }

    //ordenar según la carga de las lavadoras 'COMPARABLE'
    //si quiero establecer otro criterio de ordenacion, tengo que crear otra clase e implementar el 'COMPARATOR'
    @Override
    public int compareTo(Object o) {
       if(!(o instanceof Lavadora)) {
           return 0;
       }
       Lavadora that = (Lavadora) o;
       return that.carga - this.carga;
    }

}

package U6U7_Entregable2122_tarde;

import java.io.Serializable;

public class ParCotizacion implements Serializable {

    private Divisa divisa_base;
    private Divisa divisa_cotizada;
    private Double precio;
    private Double variacion;

    public ParCotizacion(Divisa divisa_base, Divisa divisa_cotizada, Double precio, Double variacion) {
        this.divisa_base = divisa_base;
        this.divisa_cotizada = divisa_cotizada;
        this.precio = precio;
        this.variacion = variacion;
    }

    public Divisa getDivisa_base() {
        return divisa_base;
    }

    public void setDivisa_base(Divisa divisa_base) {
        this.divisa_base = divisa_base;
    }

    public Divisa getDivisa_cotizada() {
        return divisa_cotizada;
    }

    public void setDivisa_cotizada(Divisa divisa_cotizada) {
        this.divisa_cotizada = divisa_cotizada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getVariacion() {
        return variacion;
    }

    public void setVariacion(Double variacion) {
        this.variacion = variacion;
    }

    @Override
    public String toString() {
        return "ParCotizacion{" +
                "divisa_base=" + divisa_base +
                ", divisa_cotizada=" + divisa_cotizada +
                ", precio=" + precio +
                ", variacion=" + variacion +
                '}';
    }


}

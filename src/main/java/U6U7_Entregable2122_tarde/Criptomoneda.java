package U6U7_Entregable2122_tarde;

import java.io.Serializable;

public class Criptomoneda extends Divisa implements Serializable {

    private Double precio;
    private Double volumen;
    private String fecha;
    private Integer Ranking;

    public Criptomoneda(String nombre, String simbolo, Double precio, Double volumen, String fecha, Integer ranking) {
        super(nombre, simbolo);
        this.precio = precio;
        this.volumen = volumen;
        this.fecha = fecha;
        Ranking = ranking;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getRanking() {
        return Ranking;
    }

    public void setRanking(Integer ranking) {
        Ranking = ranking;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", id=" + id +
                '}';
    }


}

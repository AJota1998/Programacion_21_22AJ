package ZZZPRACTICAS.FARA;

public class prendas {

    private Double precio;
    private String nombre;
    private Integer codigoBarras;
    private Integer peso;
    private boolean prendaColgada;
    private Integer alturaBarra;



    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Integer codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public boolean isPrendaColgada() {
        return prendaColgada;
    }

    public void setPrendaColgada(boolean prendaColgada) {
        this.prendaColgada = prendaColgada;
    }

    public Integer getAlturaBarra() {
        return alturaBarra;
    }

    public void setAlturaBarra(Integer alturaBarra) {
        this.alturaBarra = alturaBarra;
    }
}

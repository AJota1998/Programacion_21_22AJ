package ZZZPRACTICAS.FARA;

public class Prendas {

    private Double precio;
    private String nombre;
    private Integer codigoBarras;
    private Integer peso;
    protected static Integer indice = 0;



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

    public static Integer getIndice() {
        return indice;
    }

    public static void setIndice(Integer indice) {
        Prendas.indice = indice;
    }

    public Prendas(Double precio, String nombre, Integer codigoBarras, Integer peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
        setIndice(getIndice() + 1);
    }

    @Override
    public String toString() {
        return "Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigoBarras=" + codigoBarras +
                ", peso=" + peso +
                '}';
    }
}

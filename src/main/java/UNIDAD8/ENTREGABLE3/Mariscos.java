package UNIDAD8.ENTREGABLE3;

public class Mariscos {

    private String nombre;
    private String calidadSabor;
    private String precioKg;
    private String numerolote;

    public Mariscos(String nombre, String precioKg, String numerolote, String calidadSabor) {
        this.nombre = nombre;
        this.precioKg = precioKg;
        this.numerolote = numerolote;
        this.calidadSabor = calidadSabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioKg() {
        return precioKg;
    }

    public void setPrecioKg(String precioKg) {
        this.precioKg = precioKg;
    }

    public String getNumerolote() {
        return numerolote;
    }

    public void setNumerolote(String numerolote) {
        this.numerolote = numerolote;
    }

    public String getCalidadSabor() {
        return calidadSabor;
    }

    public void setCalidadSabor(String calidadSabor) {
        this.calidadSabor = calidadSabor;
    }
}

package UNIDAD5.ej7Yej8;

public class etiqueta {

    private String nombreDest;
    private String direccion;

    public etiqueta(String nombreDest, String direccion) {
        this.nombreDest = nombreDest;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "etiqueta " +
                " nombreDest='" + nombreDest + '\'' +
                ", direccion='" + direccion + '\'';
    }
}

package Ejemplo_mio;

public abstract class Dispositivo {

    protected String marca;
    protected String modelo;
    protected Double precio;
    protected Integer id;
    private static Integer contador = 1;

    public Dispositivo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.id = contador++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Dispositivo.contador = contador;
    }

    public Integer getId() {
        return id;
    }
}

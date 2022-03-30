package Ejemplo_mio;

public class Ordenador extends Dispositivo {

    private String procesador;
    private String anio_salida;

    public Ordenador(String marca, String modelo, Double precio, String procesador, String anio_salida) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.anio_salida = anio_salida;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getAnio_salida() {
        return anio_salida;
    }

    public void setAnio_salida(String anio_salida) {
        this.anio_salida = anio_salida;
    }
}

package UNIDAD5.ej7Yej8;

public class caja {

    private double ancho;
    private double alto;
    private double fondo;
    private etiqueta etiq;

    enum UnidadesU {
        cm,
        m
    }

    private UnidadesU U;

    public caja(double ancho, double alto, double fondo, UnidadesU u, etiqueta etiq) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        U = u;
        this.etiq = etiq;
    }

    //información del objeto caja, que a su vez contiene información del objeto etiqueta.
    @Override
    public String toString() {
        return
        "Ancho: " + ancho +
        " Alto: " + alto +
        " fondo: " + fondo +
        " Etiqueta: " + etiq;
    }

    //devolvemos el valor doble del volumen de la caja
    public double getvolumen() {
        double volumen = this.ancho * this.alto * this.fondo;
        return volumen;
    }

}

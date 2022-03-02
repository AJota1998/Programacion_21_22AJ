package ZZZPRACTICAS.FARA;

public abstract class Vehiculo {

    protected String matricula;
    protected int cargamaxima;
    Conductor conductor;

    public Vehiculo(String matricula, int cargamaxima, Conductor conductor) {
        this.matricula = matricula;
        this.cargamaxima = cargamaxima;
        this.conductor = conductor;
    }

    public abstract void descargar();
}

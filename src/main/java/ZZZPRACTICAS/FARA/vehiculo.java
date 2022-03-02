package ZZZPRACTICAS.FARA;

public abstract class vehiculo {

    protected String matricula;
    protected int cargamaxima;
    conductor conductor = new conductor("", "", "");

    public vehiculo(String matricula, int cargamaxima, conductor conductor) {
        this.matricula = matricula;
        this.cargamaxima = cargamaxima;
        this.conductor = conductor;
    }

    public abstract void descargar();
}

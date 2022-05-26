package T1.TEMA3.YOUTUBE.ABSTRACT.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {

    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String mostrarDatos() {
        return "Marca: " + marca + " Matrícula: " + matricula + " Modelo: " + modelo + " carga: " + carga;
    }
}

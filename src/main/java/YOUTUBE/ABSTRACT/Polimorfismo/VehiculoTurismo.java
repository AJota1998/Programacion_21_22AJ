package YOUTUBE.ABSTRACT.Polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Marca: " + marca + " Matrícula: " + matricula + " Modelo: " + modelo + " Puertas: " + nPuertas;
    }
}

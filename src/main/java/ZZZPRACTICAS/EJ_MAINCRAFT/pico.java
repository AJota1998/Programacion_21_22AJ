package ZZZPRACTICAS.EJ_MAINCRAFT;

public class pico extends Herramientas implements Minar{

    int grosor_mm;

    public pico(String Nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movibles, int grosor_mm) {
        super(Nombre, masa, capacidad_quemarse, capacidad_diluirse, movibles);
        this.grosor_mm=grosor_mm;
    }

    @Override
    public String toString() {
        return "Material{" +
                "Nombre='" + this.Nombre + '\'' +
                ", masa=" + this.masa +
                ", capacidad_quemarse=" + this.capacidad_quemarse +
                ", capacidad_diluirse=" + this.capacidad_diluirse +
                ", movibles=" + this.movibles +
                ", grosor en MM="+this.grosor_mm+
                '}';
    }


    @Override
    public void Hacer(Material mate) {
        mate.setMasa(100);

    }

    @Override
    public void Deshacer(Material mate) {
        mate.setMasa(getMasa()-100);
    }
}
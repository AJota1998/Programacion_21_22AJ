package ZZZPRACTICAS.EJ_MAINCRAFT;

public class Sierra extends Herramientas{

    private int diametro;

    public Sierra(String Nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movibles, int diametro) {
        super(Nombre, masa, capacidad_quemarse, capacidad_diluirse, movibles);
        this.diametro=diametro;
    }

    @Override
    public String toString() {
        return "Material{" +
                "Nombre='" + this.Nombre + '\'' +
                ", masa=" + this.masa +
                ", capacidad_quemarse=" + this.capacidad_quemarse +
                ", capacidad_diluirse=" + this.capacidad_diluirse +
                ", movibles=" + this.movibles +
                ", diametro="+this.diametro+
                '}';
    }
}

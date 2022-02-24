package ZZZPRACTICAS.EJ_MAINCRAFT;

public class Cristal extends Material implements Mezclar{

    protected enum tipoo{
        TRANSPARENTE,
        TRANSLUCIDO
    }
    private tipoo tipaso;

    public Cristal(String Nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movibles, tipoo tipaso) {
        super(Nombre, masa, capacidad_quemarse, capacidad_diluirse, movibles);
        this.tipaso=tipaso;
    }

    @Override
    public void MezclarConMaterial(Material mate) {
        System.out.println("El material que puedes crear es: "+this.Nombre+" de "+mate.Nombre);
    }

    @Override
    public String toString() {

        return "Material{" +
                "Nombre='" + this.Nombre + '\'' +
                ", masa=" + this.masa +
                ", capacidad_quemarse=" + this.capacidad_quemarse +
                ", capacidad_diluirse=" + this.capacidad_diluirse +
                ", movibles=" + this.movibles +
                ", tipo="+this.tipaso+
                '}';
    }
}

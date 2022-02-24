package ZZZPRACTICAS.EJ_MAINCRAFT;

public class Roca extends Material implements Mezclar{

    private int dureza;

    public Roca(String Nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movibles, int dureza) {
        super(Nombre, masa, capacidad_quemarse, capacidad_diluirse, movibles);
        this.dureza=dureza;
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
                ", dureza="+this.dureza+
                '}';
    }
}

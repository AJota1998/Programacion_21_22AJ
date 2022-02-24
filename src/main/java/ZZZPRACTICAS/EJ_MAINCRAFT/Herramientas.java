package ZZZPRACTICAS.EJ_MAINCRAFT;

public abstract class Herramientas extends Material{

    public Herramientas(String Nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movibles) {
        super(Nombre, masa, capacidad_quemarse, capacidad_diluirse, movibles);
    }
}

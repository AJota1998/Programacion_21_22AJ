package ZZZPRACTICAS.EJ_MAINCRAFT;

public abstract class Material {

    protected String Nombre;

    protected int masa;
    protected int capacidad_quemarse;
    protected int capacidad_diluirse;
    protected boolean movibles;

    public Material (String Nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movibles){
        this.Nombre=Nombre;
        setMasa(masa);
        setCapacidad_quemarse(capacidad_quemarse);
        setCapacidad_diluirse(capacidad_diluirse);
        this.movibles=movibles;
    }


    //METODOS

    public abstract String toString();


    //SETTERS

    public void setMasa(int masa) {
        if (this.masa<1000 && this.masa>-1){
            this.masa = masa;}
    }

    public int getMasa() {
        return masa;
    }

    public void setCapacidad_quemarse(int capacidad_quemarse) {
        if (this.capacidad_quemarse<1000 && this.capacidad_quemarse>-1){
            this.capacidad_quemarse = capacidad_quemarse;}

    }

    public void setCapacidad_diluirse(int capacidad_diluirse) {
        if (this.capacidad_diluirse<1000 && this.capacidad_diluirse>-1){
            this.capacidad_diluirse = capacidad_diluirse;}
    }
}

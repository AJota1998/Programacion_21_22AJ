package ZZZPRACTICAS.ENTREGABLE1;

public class Material {


    private String desc;
    private String proovedor;
    private int unidades;


    private double preciounidad;
    private static int IVA;

//Falta el rango en precio y unidad.

    public Material (String desc, String proovedor, int unidades, double preciounidad, int IVA){
        this.desc=desc;
        this.proovedor=proovedor;
        setunidades(unidades);
        setPreciounidad(preciounidad);
        Material.IVA =IVA;
    }

    public Material (String desc, int unidades, double preciounidad, int IVA){
        this.desc=desc;
        setunidades(unidades);
        setPreciounidad(preciounidad);
        Material.IVA =IVA;
    }


    //METODOS

    public static int getIVA() {
        return IVA;
    }

    public static void setIVA(int IVA) {
        Material.IVA = IVA;
    }

    public void mostrar_informacion(){
        System.out.println("La descripción es: "+this.desc);
        if (proovedor==null){
            System.out.println("No se seleccionó proovedor.");
        }else {
            System.out.println("El proovedor es: "+this.proovedor);}
        System.out.println("La cantidad de unidades es: "+this.unidades);
        System.out.println("El precio por unidad es: "+this.preciounidad);
        System.out.println("El IVA supone un "+IVA+"%");
    }

//SETTERS Y GETTERS

    public void setdesc(String desc) {
        this.desc = desc;
    }

    public String getdesc() {
        return desc;
    }

    public void setproovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public String getProovedor() {
        return proovedor;
    }

    public void setunidades(int unidades) {
        if (unidades>0&&unidades<1000){
            this.unidades = unidades;}else {this.unidades=1;}
    }

    public int getunidades() {
        return unidades;
    }

    public double getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(double preciounidad) {
        if (preciounidad>-1&&preciounidad<10000){
            this.preciounidad = preciounidad;} else {this.preciounidad=0;}
    }
}

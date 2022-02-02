package ENTREGABLE_21_22_AJ;

public class mano_obra {

    //Atributos de la clase mano_obra

    private String nombre_empresa;
    private String descripcion;
    private int horas_realizadas;
    private int cantidad_obreros;

    //constructor
    public mano_obra(String _nombre_empresa, String _descripcion, int _horas_realizadas, int _cantidad_obreros) {
        this.nombre_empresa = _nombre_empresa;
        this.descripcion = _descripcion;
        this.horas_realizadas = _horas_realizadas;
        this.cantidad_obreros = _cantidad_obreros;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras_realizadas() {
        return horas_realizadas;
    }

    public void setHoras_realizadas(int horas_realizadas) {
        this.horas_realizadas = horas_realizadas;
    }

    public int getCantidad_obreros() {
        return cantidad_obreros;
    }

    public void setCantidad_obreros(int cantidad_obreros) {
        this.cantidad_obreros = cantidad_obreros;
    }

    public void mostrar_informacion() {
        System.out.println("\nEl nombre de la empresa es: " + getNombre_empresa());
        System.out.println("La descripción es: " + getDescripcion());
        System.out.println("Las horas realizadas son: " + getHoras_realizadas());
        System.out.println("La cantidad de obreros son: " + getCantidad_obreros());
    }
}

package ENTREGABLE_21_22_AJ;

public class vivienda {

    //Atributos de la clase vivienda
    private String direccion;
    private int m2;
    public enum estancias {
        salon,
        cocina,
        bano,
        dormitorio,
        terraza,
        vestibulo,
        comedor,
        balcon
    }
    private estancias var_estancias;

    String []lista = new String[0];
    int indice_lista = 0;

    //constructor
    public vivienda(String _direccion, int _m2, estancias var_estancias) {
        this.direccion = _direccion;
        this.m2 = _m2;
        this.var_estancias = var_estancias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void imprimir_estancias() {
        for (estancias var_estancias : estancias.values()) {
            System.out.println(var_estancias);
        }
    }

    public void mostrar_informacion() {
        System.out.println("\nLa dirección es: " + direccion);
        System.out.println("Los m2 son: " + m2);
        System.out.println("Estancia: " + var_estancias);
    }


    public void insertar_lista(String[] lista, estancias est, int indice) {
        this.var_estancias = est;
    }
}

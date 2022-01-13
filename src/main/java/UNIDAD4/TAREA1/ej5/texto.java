package UNIDAD4.TAREA1.ej5;

public class texto {

    private int longit_max;
    private StringBuilder cad = new StringBuilder("");
    static final String vocales = "aeiouáéíóú";

    public texto(int longitud) {
       this.longit_max = longitud;
    }

    public void add(String anadir, int longitud, String posicion) {
        this.longit_max = longitud;
        if (cad.length() + anadir.length() < longitud) {
            System.out.println("Hay espacio disponible");
            if (posicion.equalsIgnoreCase("inicio")) {
                cad.insert(0, anadir);
            }
            if (posicion.equalsIgnoreCase("fin")) {
                cad.insert(cad.length(), anadir);
            }
        } else {
            System.out.println("No hay espacio disponible");
        }
        System.out.println(cad);
    }

    public void add2(String anadir2, int longitud, String posicion2) {
        this.longit_max = longitud;
        if (cad.length() + anadir2.length() < longitud) {
            System.out.println("Hay espacio disponible");
            if (posicion2.equalsIgnoreCase("inicio")) {
                cad.insert(0, anadir2);
            }
            if (posicion2.equalsIgnoreCase("fin")) {
                cad.insert(cad.length(), anadir2);
            }
        } else {
            System.out.println("No hay espacio disponible");
        }
        System.out.println(cad);
    }








}

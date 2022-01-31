package UNIDAD4.ej5;

public class texto {

    private int longit_max;
    private StringBuilder cad = new StringBuilder("");
    static final String vocales = "aeiouAEIOU";

    // constructor
    public texto(int longitud) {
        this.longit_max = longitud;
    }

    // metodo para añadir caracter
    public void add(char caracter, String posicion) {
        if (cad.length() + 1 < longit_max) {
            System.out.println("Hay espacio disponible");
            if (posicion.equalsIgnoreCase("inicio")) {
                this.cad.insert(0, caracter);
            }
            if (posicion.equalsIgnoreCase("fin")) {
                this.cad.insert(cad.length(), caracter);
            }
        } else {
            System.out.println("No hay espacio disponible");
        }
        System.out.println(cad);
    }

    // metodo para añadir cadena
    public void add2(String cadena, String posicion2) {
        if (cad.length() + cadena.length() < longit_max) {
            System.out.println("Hay espacio disponible");
            if (posicion2.equalsIgnoreCase("inicio")) {
                cad.insert(0, cadena);
            }
            if (posicion2.equalsIgnoreCase("fin")) {
                cad.insert(cad.length(), cadena);
            }
        } else {
            System.out.println("No hay espacio disponible");
        }
        System.out.println(cad);
    }

    // metodo para contar vocales
    public void vocales() {
        int contador = 0;
        for (int i = 0; i < cad.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (cad.charAt(i) == vocales.charAt(j)) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
}

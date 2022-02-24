package ZZZPRACTICAS.REPASO;

public class empleo extends persona {

    protected String profesion;
    protected Double remuneracion;

    public empleo(String nif, Integer edad, String nombre, Integer alturaCm, Double peso, Boolean tieneGafas, enumColorPelo colorPelo, String profesion, Double remuneracion) {
        super(nif, edad, nombre, alturaCm, peso, tieneGafas, colorPelo);
        this.profesion = profesion;
        this.remuneracion = remuneracion;
    }

    public empleo() {
        this.profesion = "militar";
        this.remuneracion = 1150.50;
    }

    //////////////////----- GETTER AND SETTER

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    @Override
    public String toString() {
        return "empleo{" +
                "profesion='" + profesion + '\'' +
                ", remuneracion=" + remuneracion +
                ", nif='" + nif + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", alturaCm=" + alturaCm +
                ", peso=" + peso +
                ", tieneGafas=" + tieneGafas +
                ", IMC=" + IMC +
                ", dni=" + dni +
                ", colorPelo=" + colorPelo +
                '}';
    }

    public void annadirapellido(String apellido) {

        setNombre(getNombre().concat(" " + apellido));

    }

    public int vocales() {
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        int contador = 0;

        for (int i = 0; i < this.nombre.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (this.nombre.charAt(i) == vocales.charAt(j)) {
                    contador++;
                }
            }
        }
        System.out.println("El nombre tiene: " + contador + " vocales");
        return contador;
    }

}

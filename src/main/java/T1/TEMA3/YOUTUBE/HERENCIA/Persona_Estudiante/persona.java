package T1.TEMA3.YOUTUBE.HERENCIA.Persona_Estudiante;

public class persona {

    //protected significa que es accesible por la propia clase así como por todas sus clases hijas.
    protected String nombre;
    private String apellido;
    private int edad;

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}

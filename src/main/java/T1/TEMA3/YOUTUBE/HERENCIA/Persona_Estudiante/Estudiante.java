package T1.TEMA3.YOUTUBE.HERENCIA.Persona_Estudiante;

public class Estudiante extends persona {

    private int codigo_Estudiante;
    private double notaFinal;

    //constructor de mi clase estudiante
    public Estudiante (String nombre, String apellido, int edad, int codigo_Estudiante, double notaFinal) {
        super(nombre, apellido, edad);
        this.codigo_Estudiante = codigo_Estudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos () {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getNombre());
        System.out.println("Codigo Estudiante: " + codigo_Estudiante);
        System.out.println("Nota final: " + notaFinal);
    }
}

package YOUTUBE.Constantes;

public class Persona {

    //hemos creado una constante
    //de un atributo tipo constante no se puede obtener setter, se rellena en el constructor y no cambia nunca más.
    private final String nombre;
    private int edad;

    //constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   public void informacion() {
       System.out.println("El nombre es: " + nombre);
       System.out.println("La edad es: " + edad);
   }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

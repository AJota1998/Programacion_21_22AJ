package UNIDAD7.TAREA4;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    String nombre;
    String dni;
    Integer edad;
    Double estatura;

    public Persona(String nombre, String dni, Integer edad, Double estatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(edad);
        System.out.println(estatura);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
}

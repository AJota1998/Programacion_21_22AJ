package T2.U6U7_EXAMEN2122_TARDE;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer id;
    public static Integer contador_actores = 1;

    public Actor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.id = contador_actores++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(nombre, actor.nombre) && Objects.equals(apellido, actor.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getContador_actores() {
        return contador_actores;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre '" + nombre + '\'' +
                ", apellido '" + apellido + '\'' +
                ", nacionalidad '" + nacionalidad + '\'' +
                ", id " + id +
                '}';
    }
}

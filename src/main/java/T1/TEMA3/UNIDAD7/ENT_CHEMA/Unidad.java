package T1.TEMA3.UNIDAD7.ENT_CHEMA;

import java.io.Serializable;
import java.util.Objects;

public class Unidad implements Serializable {
    String nombre;

    public Unidad(String nombre) {
        setNombre(nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unidad)) return false;
        Unidad unidad = (Unidad) o;
        return Objects.equals(nombre, unidad.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "unidad=" + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

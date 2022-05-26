package T2.U6U7_Entregable2122_tarde;

import java.io.Serializable;
import java.util.Objects;

public abstract class Divisa implements Serializable {

    protected String nombre;
    protected String simbolo;
    protected Integer id;

    private static Integer contador = 1;

    public Divisa(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.id = contador++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Divisa divisa = (Divisa) o;
        return Objects.equals(simbolo, divisa.simbolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simbolo);
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", id=" + id +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

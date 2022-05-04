package UNIDAD8.JSON.EJ1;

import java.util.List;

public class Futbolista {

    private int dorsal;
    private String nombre;
    private List<String> demarcacion;
    private String equipo;

    public Futbolista(int dorsal, String nombre, List<String> demarcacion, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(List<String> demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", demarcacion=" + demarcacion +
                ", equipo='" + equipo + '\'' +
                '}' + "\n";
    }
}

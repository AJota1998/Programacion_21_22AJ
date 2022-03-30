package Ejemplo_mio;

import java.util.HashSet;
import java.util.Set;

public class Coleccion {

    private String nombre_coleccion;
    Set<Dispositivo> conjunto_dispositivos;

    public Coleccion(String nombre_coleccion) {
        this.nombre_coleccion = nombre_coleccion;
        conjunto_dispositivos = new HashSet<>();
    }

    public Set<Dispositivo> addDispositivo (Dispositivo disp) {
        Set<Dispositivo> resultado = new HashSet<>();

        if(!conjunto_dispositivos.contains(disp)) {
            conjunto_dispositivos.add(disp);
            resultado.addAll(conjunto_dispositivos);
        }
        resultado.addAll(conjunto_dispositivos);
        return resultado;
    }

    public Set<Dispositivo> deleteDispositivo (Dispositivo disp) {
        Set<Dispositivo> resultado = new HashSet<>();

        if(conjunto_dispositivos.contains(disp)) {
            conjunto_dispositivos.remove(disp);
            resultado.addAll(conjunto_dispositivos);
        }
        resultado.addAll(conjunto_dispositivos);
        return resultado;
    }
}

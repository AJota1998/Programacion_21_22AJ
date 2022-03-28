package U6U7_Entregable2122_tarde;


import UNIDAD7.ENT_CHEMA.Alumno;

import java.io.*;
import java.util.*;

public class Exchange implements Serializable {

    private String nombre;
    private Map<Divisa, List<ParCotizacion>> mapa;

    public Exchange(String nombre) {
        this.nombre = nombre;
        this.mapa = new HashMap<>();
    }

    public void mostrarDivisasOrdenadas() {
        Set<Divisa> ordenada = new TreeSet<Divisa>(new Comparator<Divisa>() {
                    @Override
                    public int compare(Divisa d1, Divisa d2) {
                        return d1.getSimbolo().compareTo(d2.getSimbolo());
                    }
                });
        for (Map.Entry entry : mapa.entrySet()) {
            ordenada.add((Divisa) entry.getKey());
        }
        System.out.println(ordenada);
    }

    public void obtenerCotizaciones(String simbolo) {}

    public void mostrarCotizacionesAlAlzaUnaHora() {}

    public void addCotizacion(ParCotizacion cotizacion) {
        if (!mapa.containsKey(cotizacion.getDivisa_base())) {
            ArrayList<ParCotizacion> arrayPares = new ArrayList<>();
            arrayPares.add(cotizacion);
            mapa.put(cotizacion.getDivisa_base(), arrayPares);
        } else {
            mapa.get(cotizacion.getDivisa_base()).add(cotizacion);
        }
        System.out.println(mapa);
    }

    public void guardarCotizaciones() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("ficheros/cotizaciones.dat"))) {
            Set<ParCotizacion> coti = new HashSet<>();
            Set<Map.Entry<Divisa, List<ParCotizacion>>> entradas = mapa.entrySet();
            Iterator<Map.Entry<Divisa, List<ParCotizacion>>> it = entradas.iterator();
            while (it.hasNext()) {
                Map.Entry<Divisa, List<ParCotizacion>> entrada = it.next();
                coti.addAll(entrada.getValue());
            }
            out.writeObject(coti);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void recuperarCotizaciones() {

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("ficheros/cotizaciones.dat"))) {
            Set<ParCotizacion> completa = (Set<ParCotizacion>) in.readObject();
            mapa.clear();
            System.out.println("Borrar mapa");
            System.out.println(mapa);
            Iterator<ParCotizacion> it = completa.iterator();
            while (it.hasNext()) {
                ParCotizacion a = it.next();
                addCotizacion(a);
            }
            System.out.println("Mapa cargado");
            System.out.println(mapa);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

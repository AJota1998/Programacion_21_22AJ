package U6U7_EXAMEN2122_TARDE;


import java.io.*;
import java.util.*;

public class Filmaffinity implements Serializable {

    Set<Pelicula> conjunto_pelis = new HashSet<>();

    Set<Actor> conjunto_actores = new HashSet<>();

    Map<Pelicula, Set<Actor>> mapaPeliActor = new HashMap<>();

    Map<Actor, Set<Pelicula>> mapaActorPeli = new HashMap<>();

    public Filmaffinity() {
    }

    public void addPeliculaActor(Pelicula p, Actor a) {
        conjunto_pelis.add(p);
        conjunto_actores.add(a);
        mapaPeliActor.put(p, conjunto_actores);
        mapaActorPeli.put(a, conjunto_pelis);

        System.out.println(mapaPeliActor);
        System.out.println(mapaActorPeli);
    }

    public List<Actor> getActores(Pelicula p) {
        Pelicula aux = p;
        List<Actor> listaActores = new ArrayList<>();
        if (mapaPeliActor.containsKey(aux)) {
            listaActores = (List<Actor>) mapaPeliActor.get(aux);
        }
        listaActores.sort(
                new Comparator<Actor>() {
                    @Override
                    public int compare(Actor a1, Actor a2) {
                        return a1.getApellido().compareTo(a2.getApellido());
                    }

                });
        return listaActores;
    }

    //public List<Pelicula> getPeliculas(Actor a){

    //}

    public Pelicula getPelicula(String titulo) {
        Pelicula resultado = new Pelicula("", "", "", "", "");
        Iterator<Pelicula> it = mapaPeliActor.keySet().iterator();
        while (it.hasNext()) {
            Pelicula p = it.next();
            if (p.getTitulo().equals(titulo)) {
                return resultado = p;
            }
        }
        return resultado;
    }

    public void removePelicula(String titulo){

    Iterator<Map.Entry<Actor, Set<Pelicula>>> it = mapaActorPeli.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry<Actor, Set<Pelicula>> entrada = it.next();

        Iterator<Pelicula> it_peli = entrada.getValue().iterator();
        while (it_peli.hasNext()) {
            Pelicula p = it_peli.next();
            if (p.getTitulo().equals(titulo)) {
                it_peli.remove();
                conjunto_pelis.remove(p);
            }
        }
    }

    }

    public Actor getActor(String nombre, String apellido) {
        Actor resultado = new Actor("", "", "");
        Iterator<Actor> it = mapaActorPeli.keySet().iterator();
        while (it.hasNext()) {
            Actor a = it.next();
            if (a.getNombre().equals(nombre) && a.getApellido().equals(apellido)) {
                return resultado = a;
            }
        }
        return resultado;
    }


    public void guardarDatos() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("ficheros/filmaffinity.dat"))) {
            Set<Actor> m1 = new HashSet<>();
            Set<Map.Entry<Pelicula, Set<Actor>>> entradas = mapaPeliActor.entrySet();
            Iterator<Map.Entry<Pelicula, Set<Actor>>> it = entradas.iterator();
            while (it.hasNext()) {
                Map.Entry<Pelicula, Set<Actor>> entrada = it.next();
                m1.addAll(entrada.getValue());
            }
            out.writeObject(conjunto_pelis);
            out.writeObject(conjunto_actores);
            out.writeObject(m1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("ficheros/filmaffinity.dat"))) {
            Set<Pelicula> m2 = new HashSet<>();
            Set<Map.Entry<Actor, Set<Pelicula>>> entradas = mapaActorPeli.entrySet();
            Iterator<Map.Entry<Actor, Set<Pelicula>>> it = entradas.iterator();
            while (it.hasNext()) {
                Map.Entry<Actor, Set<Pelicula>> entrada = it.next();
                m2.addAll(entrada.getValue());
            }
            out.writeObject(m2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void cargarDatos() {
    }
}

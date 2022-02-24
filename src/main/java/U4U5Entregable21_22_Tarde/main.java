package U4U5Entregable21_22_Tarde;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Serie serie1 = new Serie(2022, "Dark", "Juan bocio", 1);

        serie1.addcapitulo("vidas paralelas");
        serie1.addcapitulo("hijos nuestros");
        serie1.addcapitulo("sombras");
        serie1.addcapitulo("La ruina");
        serie1.addcapitulo("Espejismo");
        serie1.addcapitulo("Al padre");
        serie1.addcapitulo("Al hijo");
        serie1.addcapitulo("Rateros de alma");

        System.out.println(serie1);
        System.out.println("---");

        serie1.eliminar_capitulo("hijos nuestros");
        System.out.println(serie1);
        System.out.println("---");
        serie1.dar_por_finalizado();
        System.out.println("---");
        serie1.play();
        System.out.println("---");

        Libro libro1 = new Libro(2021, "Aroma a fresa", "Pere jordan", "Planeta", 65129857, 270);

        System.out.println(libro1);
        System.out.println("---");
        libro1.dar_por_finalizado();
        System.out.println("---");
        libro1.pause();
        System.out.println("---");

        Pelicula pelicula1 = new Pelicula(2009, "litros de sangre", "Rosa Arguinez", 120.0, "Warner", "EEUU");
        System.out.println(pelicula1);
        System.out.println("---");
        pelicula1.dar_por_finalizado();
        System.out.println("---");
        pelicula1.stop();

        catalogo catalogo1 = new catalogo(3, "cat1");
        catalogo1.add(serie1);
        catalogo1.add(pelicula1);
        catalogo1.add(libro1);
        System.out.println("---");
        System.out.println(catalogo1);
        System.out.println("---");
        catalogo1.eliminar_elemento_catalogo(pelicula1);
        System.out.println("---");
        System.out.println(catalogo1);


    }
}

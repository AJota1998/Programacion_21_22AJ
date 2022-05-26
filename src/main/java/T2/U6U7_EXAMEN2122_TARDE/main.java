package T2.U6U7_EXAMEN2122_TARDE;

public class main {
    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Dama negra", "2015", "Inglaterra", "Juan Pérez", "Terror");
        Pelicula peli2 = new Pelicula("Bosque de Adas", "2005", "Francia", "Francisco Ortiz", "Fantasía");
        Pelicula peli3 = new Pelicula("Amor pasional", "2009", "Inglaterra", "Roberto Ordoñez", "Romántico");
        Pelicula peli4 = new Pelicula("Futboleros", "2021", "España", "Ana Roldán", "Comedia");
        Pelicula peli5 = new Pelicula("Sufrimiento del Programador", "2022", "España", "Chema García", "Comedia");

        Actor actor1 = new Actor("Adrian", "Ruiz", "Española");
        Actor actor2 = new Actor("Ana", "Romero", "Chilena");
        Actor actor3 = new Actor("Belén", "Ruiz", "Argentina");
        Actor actor4 = new Actor("Alejandro", "Estévez", "Española");
        Actor actor5 = new Actor("Rocio", "Fernández", "Española");

        Filmaffinity f1 = new Filmaffinity();

        f1.addPeliculaActor(peli1, actor1);
        System.out.println();
        f1.addPeliculaActor(peli1, actor2);

        f1.guardarDatos();
        System.out.println();

        System.out.println(f1.getPelicula("Dama negra"));

        System.out.println();
        System.out.println(f1.getActor("Adrian", "Ruiz"));

        System.out.println();
        f1.removePelicula("Dama negra");

        System.out.println();





    }
}

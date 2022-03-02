package ZZZPRACTICAS.ENTREGABLE_24F;

public class main {
    public static void main(String[] args) {

        System.out.println("------SERIE-------");

        String[] capitulosBreakingBad = {"S01E01", "S01E02","S01E03","S01E04","S01E05","S01E06","S01E07","S01E08","S01E09",};
        Serie BreakingBad = new Serie("Breaking Bad", 2020, "Antonio", 1, capitulosBreakingBad);
        System.out.println("La serie:");
        System.out.println(BreakingBad);
        BreakingBad.addCapitulo("S01E10");
        BreakingBad.eliminarCapitulo("S01E05");
        System.out.println("La serie con un capítulo añadido y otro eliminado:");
        System.out.println(BreakingBad);
        BreakingBad.darPorFinalizado();
        System.out.println(BreakingBad);
        BreakingBad.play();
        BreakingBad.pause();
        BreakingBad.stop();


        System.out.println("-----PELICULA-----");

        Pelicula OperacionCamaron  = new Pelicula("Operacion Camaron", 2021, "Socorro", 135D, "Telecirco","España");
        System.out.println("La pelicula:");
        System.out.println(OperacionCamaron);
        OperacionCamaron.darPorFinalizado();
        System.out.println(OperacionCamaron);
        OperacionCamaron.play();
        OperacionCamaron.pause();
        OperacionCamaron.stop();


        System.out.println("------LIBRO-------");

        Libro ElSantoGrial = new Libro("El Santo Grial", 1995, "Desconocido", "Minotauro", 658865L, 789);
        System.out.println("El libro:");
        System.out.println(ElSantoGrial);
        ElSantoGrial.darPorFinalizado();
        System.out.println(ElSantoGrial);


        System.out.println("-----CATALOGO-----");

        Multimedia[] coleccion = {ElSantoGrial, OperacionCamaron, BreakingBad};
        Catalogo Ajota = new Catalogo(coleccion);
        System.out.println("El catálogo creado:");
        System.out.println(Ajota);
        Pelicula Yojimbo  = new Pelicula("Yojimbo", 1961, "Akira Kurosawa", 110D, "Kurosawa Production","Japón");
        System.out.println("Añadimos Yojimbo: ");
        Ajota.addMultimedia(Yojimbo);
        System.out.println(Ajota);
        System.out.println("Eliminamos Operación Camarón:");
        Ajota.eleminarMultimedia(OperacionCamaron);
        System.out.println(Ajota);
        System.out.println("Ordenamos por ID:");
        Ajota.ordenarPorId();
        System.out.println(Ajota);
        System.out.println("Ordenamos por año:");
        Ajota.ordenarPorAnyo();
        System.out.println(Ajota);
        System.out.println("Ordenamos por Título:");
        Ajota.ordenarPorTitulo();
        System.out.println(Ajota);
        System.out.println("El número de elementos del catálogo:");
        System.out.println(Ajota.numeroElementos());
    }
}

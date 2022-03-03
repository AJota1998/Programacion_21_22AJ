package Examen3Marzo;

public class main {
    public static void main(String[] args) {

        Integrante integ1 = new Integrante(1, "Juan corellano", 19, "Chiclana");
        Integrante integ2 = new Integrante(2, "Juan Sobro", 38, "Jerez");
        Integrante integ3 = new Integrante(3, "Rocio Ruiz", 66, "Cadiz");
        Integrante integ4 = new Integrante(4, "Pepe mulato", 24, "El puerto");
        Integrante integ5 = new Integrante(5, "Ana Franco", 23, "Cadiz");


        Coro coro1 = new Coro("Coloraos", "Juan alberto", "Rosa", "Rocio", "Caballero", 29, 12, 8);
        Cuarteto cuart1 = new Cuarteto("Los verdes", "Rocio", "Alberto", "Julio", "Magos", 230, 10);
        Romancero rom1 = new Romancero("Poetas de Jere", "Bernardo", "Carmen", "Felix", "Discos duros", "Amor a la informatica");
        Chirigota chiri1 = new Chirigota("Los programadores aprobaos", "Chema", "Alejandro", "Juan carlos", "Taza de té", 3, 40);
        Comparsa comp1 = new Comparsa("Rocio del alba", "Nuria", "Quique", "Julian", "Caja", 50, "Visteme, S.A.");

        //Insetamos integrantes en un coro, el ejemplo se podria utilizar en todas las del mismo tipo, comparsa, cuarteto, etc. Esto es un ejemplo
        System.out.println("---INSERTAMOS EN EL ARRAY---");
        coro1.insertar_integrante(integ1);
        coro1.insertar_integrante(integ2);
        coro1.insertar_integrante(integ3);
        coro1.insertar_integrante(integ4);
        coro1.insertar_integrante(integ5);
        System.out.println(coro1);

        System.out.println("\n--ELIMINAMOS UN ELEMENTO DEL ARRAY---");
        coro1.eliminar_integrante(integ3);
        System.out.println(coro1);

        //Probamos el metodo con un cuarteto
        System.out.println();
        cuart1.caminito_del_falla();

        //Probamos el metodo con un romancero
        System.out.println();
        rom1.hacer_tipo();

        //Probamos el metodo con un cuarteto
        System.out.println();
        comp1.cantar_la_presentacion();

        //Probamos el metodo que hemos implementado en la interface con una chirigota
        System.out.println();
        chiri1.amo_a_escuchar();

        //Vamos a incribir agrupaciones
        AgrupacionOficial[] agrupaciones = {coro1, chiri1, comp1};
        COAC coac1 = new COAC(agrupaciones);
        System.out.println(coac1);
        System.out.println();
        coac1.insertar_agrupacion(coro1);
        System.out.println(coac1);
        System.out.println();
        coac1.eliminar_agrupacion(chiri1);
        System.out.println(coac1);
        System.out.println();
        //Ordenar por nombre
        coac1.compararnombre();
        System.out.println(coac1);
        //Ordenar por Puntos
        System.out.println();
        coac1.compararPuntos();
        System.out.println(coac1);




    }
}

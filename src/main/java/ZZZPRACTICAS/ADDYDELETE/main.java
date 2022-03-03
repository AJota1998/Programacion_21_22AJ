package ZZZPRACTICAS.ADDYDELETE;

public class main {
    public static void main(String[] args) {

        //Creamos los objetos coche que vamos a introducir en el array de coches que hemos creado en el camion
        Coche coche1 = new Coche("Opel", "Astra", "rojo");
        Coche coche2 = new Coche("Ford", "Focus", "verde");
        Coche coche3 = new Coche("Renault", "Clio", "negro");
        Coche coche4 = new Coche("Citroen", "C3", "amarillo");
        Coche coche5 = new Coche("Opel", "Corsa", "rojo");

        //creamos el camion donde introduciremos los coches
        CamionCoche camion1 = new CamionCoche("Camion1", "Juan corellano");

        //introducimos los coches en el array de coches del camion
        camion1.addCoche(coche1);
        camion1.addCoche(coche2);
        camion1.addCoche(coche3);
        camion1.addCoche(coche4);
        camion1.addCoche(coche5);

        System.out.println("---CAMION CON SUS COCHES ANEXADOS---");
        System.out.println(camion1);

        camion1.eliminarCoche(1);
        System.out.println("\n---CAMION DESPUES DE ELIMINAR UN INDICE DEL ARRAY---");
        System.out.println(camion1);

        System.out.println("\n---CAMION DESPUES DE ELIMINAR UN OBJETO DEL ARRAY---");
        camion1.eliminarCocheobjeto(coche5);


    }

}

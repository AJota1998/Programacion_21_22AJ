package T1.TEMA3.UNIDAD4.ej8;

public class bombilla {

    // creamos variables bombillas
    boolean bomb1;
    String auxbomb1;
    boolean bomb2;
    String auxbomb2;
    boolean bomb3;
    String auxbomb3;

    // creamos la variable interruptor general de la casa
    public boolean interruptorclase;

    // creamos el constructor porque queremos traer informacion del main
    public bombilla(boolean bombilla1, boolean bombilla2, boolean bombilla3) {
        this.bomb1 = bombilla1;
        this.bomb2 = bombilla2;
        this.bomb3 = bombilla3;
    }

    public void estado(String bomb1, String bomb2, String bomb3) {
        if(bomb1.equalsIgnoreCase("encendida")) {
            this.bomb1 = true;
            this.auxbomb1 = "Bombilla 1 encendida";
            System.out.println("Bombilla 1 encendida");
        } else if(bomb1.equalsIgnoreCase("apagada")) {
            this.bomb1 = false;
            this.auxbomb1 = "Bombilla 1 apagada";
            System.out.println("Bombilla 1 apagada");
        } else {
            System.out.println("Mensaje erróneo, la bombilla 1 se queda apagada por defecto");
            this.auxbomb1 = "Bombilla 1 apagada";
        }
        if(bomb2.equalsIgnoreCase("encendida")) {
            this.bomb2 = true;
            this.auxbomb2 = "Bombilla 2 encendida";
            System.out.println("Bombilla 2 encendida");
        } else if(bomb2.equalsIgnoreCase("apagada")) {
            this.bomb2 = false;
            this.auxbomb2 = "Bombilla 2 apagada";
            System.out.println("Bombilla 2 apagada");
        } else {
            System.out.println("Mensaje erróneo, la bombilla 2 se queda apagada por defecto");
            this.auxbomb2 = "Bombilla 2 apagada";
        }
        if(bomb3.equalsIgnoreCase("encendida")) {
            this.bomb3 = true;
            this.auxbomb3 = "Bombilla 3 encendida";
            System.out.println("Bombilla 3 encendida");
        } else if(bomb3.equalsIgnoreCase("apagada")) {
            this.bomb3 = false;
            this.auxbomb3 = "Bombilla 3 apagada";
            System.out.println("Bombilla 3 apagada");
        } else {
            System.out.println("Mensaje erróneo, la bombilla 3 se queda apagada por defecto");
            this.auxbomb3 = "Bombilla 3 apagada";
        }
    }

    // creamos el metodo del interruptor general de la casa
    public void interruptor(String interr) {
        if(interr.equalsIgnoreCase("encendido")) {
            this.interruptorclase = true;
            System.out.println("Los fusibles funcionan perfectamente, fin del programa");
        } if(interr.equalsIgnoreCase("apagado")) {
            this.interruptorclase = false;
            System.out.println("Ups, todas las bombillas de la casa se han apagado");
        }
    }
    // creamos el metodo reanudar los fusibles
    public void reaunadar(String interr) {
        if(interr.equalsIgnoreCase("si")) {
            System.out.println("Los fusibles han vuelto a funcionar, fin del programa");
            System.out.println(auxbomb1);
            System.out.println(auxbomb2);
            System.out.println(auxbomb3);
        } else if (interr.equalsIgnoreCase("no")) {
            System.out.println("Todas las bombillas siguen apagadas");
        } else {
            System.out.println("Mensaje erróneo, todas las bombillas siguen apagadas");
        }
    }
}

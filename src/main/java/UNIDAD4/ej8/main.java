package UNIDAD4.ej8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean bombilla1 = false;
        boolean bombilla2 = false;
        boolean bombilla3 = false;
        boolean interruptor = false;

        // creamos el objeto
        bombilla const1 = new bombilla(bombilla1, bombilla2, bombilla3);

        // preguntamos al usuario el estado de las bombillas
        System.out.println("Indique el estado de la bombilla1: ''encendida'', ''apagada''");
        String bomb1 = teclado.next();
        System.out.println("Indique el estado de la bombilla2: ''encendida'', ''apagada''");
        String bomb2 = teclado.next();
        System.out.println("Indique el estado de la bombilla3: ''encendida'', ''apagada''");
        String bomb3 = teclado.next();

        // llamamos al metodo estado
        const1.estado(bomb1, bomb2, bomb3);

        // preguntamos por el interruptor
        System.out.println("En que estado se encuentra el interruptor general: ''encendido'', ''apagado''");
        String interr = teclado.next();
        if(interr.equalsIgnoreCase("encendido")) {
            interruptor = true;
        }

        //llamamos al metodo interr
        const1.interruptor(interr);

        if(!interruptor) {
            //Preguntamos si ya se encuentran encendidos los fusibles del interruptor
            System.out.println("¿Están ya encendidos los fusibles? ''si'', ''no''");
            interr = teclado.next();

            // llamamos al metodo reanudar
            const1.reaunadar(interr);
        }

    }
}

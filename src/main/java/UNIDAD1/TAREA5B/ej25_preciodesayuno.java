package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej25_preciodesayuno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float precio = 0f;
        float preciobebida = 0f;

        System.out.println("Qué ha tomado para comer: palmera, donut o pitufo");
        String comer = teclado.next();

        if(comer.equalsIgnoreCase("palmera")) {
            precio = 1.40f;
            System.out.println("Precio de la palmera: " + precio);
        } else if (comer.equalsIgnoreCase("donut")) {
            precio = 1f;
            System.out.println("Precio del donut: " + precio);
        } else if (comer.equalsIgnoreCase("pitufo")) {
            System.out.println("Con aceite o con tortilla");
            String pitufo = teclado.next();
            if (pitufo.equalsIgnoreCase("aceite")) {
                precio = 1.20f;
                System.out.println("Precio de pitufo con aceite: " + precio);
            } else if (pitufo.equalsIgnoreCase("tortilla")) {
                precio = 1.60f;
                System.out.println("Precio de pitufo con tortilla: " + precio);
            }
        }

        System.out.println("Qué ha tomado de beber: zumo o cafe");
        String beber = teclado.next();

        if (beber.equalsIgnoreCase("zumo")) {
            preciobebida = 1.50f;
            System.out.println("Precio del zumo: " + preciobebida);
        } else {
            preciobebida = 1.20f;
            System.out.println("Precio del café: " + preciobebida);
        }
        System.out.println();
        System.out.println("Total del desayuno: " + (precio + preciobebida));
    }
}

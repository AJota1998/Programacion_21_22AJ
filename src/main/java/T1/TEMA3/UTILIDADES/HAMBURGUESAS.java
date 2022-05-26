package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class HAMBURGUESAS {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int prehbasi = 3;
        double prehgour = 5;

        System.out.println("Pedidos pintaza feliz");
        System.out.print("Número de hamburguesas básicas: ");
        int nhb = teclado.nextInt();
        System.out.print("Número de hamburguesas gourmet: ");
        int nhg = teclado.nextInt();

        System.out.print("Dia de la semana: ");
        String dia = teclado.next();

        if (dia.equals("martes") && nhg == 2) {
            prehgour = 4.5;
        }
        if (dia.equals("miercoles")) {
            prehbasi = 2;
        }

        double preciototal = (prehgour * nhg) + (prehbasi * nhb);

        System.out.print("¿Pertenece al club Fanegas? (s/n): ");
        String cfane = teclado.next();

        double descuento = 0;

        if (cfane.equals("s")) {
            descuento = preciototal * 12 / 100;
        }

        double precondes = preciototal - descuento;

        System.out.println("Aquí tiene su pedido. Gracias.");
        System.out.println("Hamburguesas básicas: " + nhb);
        System.out.println("Hamburguesas gourmet: " + nhg);
        System.out.println("Total: " + preciototal + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + precondes + " €");
    }
}

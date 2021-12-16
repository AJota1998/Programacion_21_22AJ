package ENTREGABLES.primerentregable;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int HBasica = 3;
        double HGourmet = 5;

        System.out.println("Pedidos Pitanza Feliz");
        System.out.println("Número de Hamburguesas básicas");
        int nb = teclado.nextInt();
        System.out.println("Número de Hamburguesas Gourmet");
        int ng = teclado.nextInt();
        System.out.println("Día de la semana");
        String dia = teclado.next();
        System.out.println("Pertenece al club Fanegas (s/n)");
        String club = teclado.next();

        if (dia.equals("Martes")) {
            HGourmet = (HGourmet / 2) + 2;
        } else if (dia.equals("miercoles")) {
            HBasica = 2;
        }
        System.out.println("Aquí tiene su pedido. Gracias por su compra");
        System.out.println("Hamburguesas básicas " + nb);
        System.out.println("Hamburguesas gourmet " + ng);
        double total = (nb * HBasica) + (ng * HGourmet);
        double descuento = 0;
        System.out.println("Total " + total);

        if (club.equals("s")) {
            total = total * 0.88;
            descuento = total * 0.12;

        }
        System.out.println("Descuento " + descuento + " €");
        System.out.println("Total a pagar " + total + " €");




    }
}

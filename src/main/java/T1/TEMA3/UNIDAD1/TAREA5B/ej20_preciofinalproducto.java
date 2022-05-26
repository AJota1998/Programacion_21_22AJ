package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej20_preciofinalproducto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la base imponible");
        float base = teclado.nextInt();

        System.out.println("Introduzca el tipo de IVA, 21, 10, 4");
        int iva = teclado.nextInt();

        System.out.println("Introduzca promoción: 1-nopro, 2-mitad, 3-meno5€, 4-meno5% ");
        int promo = teclado.nextInt();

        while (promo <0 || promo > 4) {
            System.out.println("Por favor, introduce un número válido");
            promo = teclado.nextInt();
        }

        float totaliva = ((base * iva) / 100);
        float precioconiva = base + totaliva;

        System.out.println("---Desglose de la factura---");
        System.out.println();

        System.out.println("Precio sin IVA: " + base);
        System.out.println("IVA: " + iva + "%");
        System.out.println("Total IVA: " + totaliva);
        System.out.println("Total con IVA: " + precioconiva);
        if (promo == 2) {
            precioconiva = precioconiva / 2;
            System.out.println("Código del 50%");
        } else if (promo == 3) {
            precioconiva = precioconiva - 5;
            System.out.println("Código de -5€");
        } else if (promo == 4) {
            precioconiva = precioconiva * 0.95f;
            System.out.println("Código de -5%");
        } else {
            System.out.println("Sin promoción");
        }
        System.out.println("Total factura: " + precioconiva);
    }
}

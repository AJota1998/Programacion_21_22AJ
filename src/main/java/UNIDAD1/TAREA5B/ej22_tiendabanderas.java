package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej22_tiendabanderas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura en cm");
        int altura = teclado.nextInt();

        System.out.println("Introduzca la anchura en cm");
        int anchura = teclado.nextInt();

        System.out.println("Quiere escudo bordado, S/N");
        String escudo = teclado.next();

        float envio = 3.25f;
        float preciocentimetro = 0.01f;
        float preciobase = (float) (altura * anchura) * preciocentimetro;

        System.out.println("---Desglose de la factura---");
        System.out.println();
        System.out.println("Precio base de la bandera: " + preciobase);

        if (escudo.equalsIgnoreCase("s")) {
        System.out.println("Precio con escudo: " + (preciobase + 2));
        } else {
        System.out.println("Precio sin escudo: " + preciobase);
        }
        System.out.println("Envío: " + envio);
        System.out.println("Total factura: " + (preciobase + envio));
    }
}

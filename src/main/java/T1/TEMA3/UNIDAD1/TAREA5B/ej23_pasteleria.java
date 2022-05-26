package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej23_pasteleria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qué sabor de tarde desea: 1-manzana, 2-fresa, 3-chocolate");
        String sabor = teclado.next();
        float precio = 0f;

        if (sabor.equalsIgnoreCase("chocolate")) {
            System.out.println("Qué tipo de chocolate quiere: 1-negro, 2-blanco");
            String chocolate = teclado.next();
            if (chocolate.equalsIgnoreCase("negro")) {
                precio = 14;
                System.out.println("Precio de la tarda de chocolate negro: " + precio);
            } else if (chocolate.equalsIgnoreCase("blanco")) {
                precio = 15;
                System.out.println("Precio de la tarta de chocolate blanco: " + precio);
            }
        } else if (sabor.equalsIgnoreCase("manzana")) {
            precio = 18;
            System.out.println("Precio de la tarde de manzana: " + precio);
        } else if (sabor.equalsIgnoreCase("fresa")) {
            precio = 16;
            System.out.println("Precio de la tarta de fresa: " + precio);
        }

        System.out.println("Quiere nata, S/N");
        String nata = teclado.next();
        if (nata.equalsIgnoreCase("s")) {
            precio = precio + 2.50f;
            System.out.println("Suplemento de nata +2.50€ " + precio);
        }

        System.out.println("Quiere ponerle nombre, S/N");
        String nombre = teclado.next();
        if (nombre.equalsIgnoreCase("s")) {
            precio = precio + 2.75f;
            System.out.println("Suplemento de nombre: +2.75€ " + precio);
        }
        System.out.println();
        System.out.println("Total a pagar: " + precio);
        System.out.println("Gracias por su compra");
    }
}

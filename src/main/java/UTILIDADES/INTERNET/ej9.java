package UTILIDADES.INTERNET;


import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        double numero = teclado.nextDouble();

        final float IVA = 0.21f;

        float precio = (float) (numero + (numero * IVA));

        System.out.println("Precio sin IVA " + numero + " Precio con IVA" + precio);
    }
}

package EXAMEN_AJ;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double abs = 0.2;
        double pla = 0.3;
        double madera = 0.5;
        double flexible = 0.7;
        int envio = 2;
        int posp = 0;
        double pt = 0;

        System.out.println("Bienvenido a Carbonita Volando");
        System.out.println("Introduzca el peso de su figura en gramos");
        int peso = teclado.nextInt();

        System.out.println("Introduzca el tipo de material, 1-ABS, 2-PLA, 3-madera, 4-flexible");
        int material = teclado.nextInt();
            if (material == 1) {
                pt = peso * abs;
            } else if (material == 2) {
                pt = peso * pla;
            } else if (material == 3) {
                pt = peso * madera;
            } else if (material == 4) {
                pt = peso * flexible;
            } else System.out.println("Introduce un material válido");

        System.out.println("¿Quiere posprocesado? s/n");
        String posprocesado = teclado.next();
            if (posprocesado.equals("s")) {
                posp = 3;
            }
        System.out.println("¿Pertenece a enjunto3D? s/n");
        String enjunto = teclado.next();
            if (enjunto.equals("s")) {
                envio = 0;
            }
            double total = pt + posp + envio;
        System.out.println("El coste total de la pieza es " + total);

    }
}

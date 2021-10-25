package Practica_Entregable;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota examen 1");
        double n1 = teclado.nextDouble();

        System.out.println("Nota examen 2");
        double n2 = teclado.nextDouble();

        System.out.println("Introduce examen 3");
        double n3 = teclado.nextDouble();

        double media = ((n1 + n2 + n3) / 3);

        if (media >= 5 && media < 6) {
            System.out.println("La media es " + media + " suficiente");
        } else if (media >= 6 && media < 7) {
            System.out.println("La media es " + media + " bien");
        } else if (media >= 7 && media < 9) {
            System.out.println("La media es " + media + " notable");
        } else if (media >= 9 && media <= 10) {
            System.out.println("La media es " + media + " sobresaliente");
        }
        if (media < 5) {
            System.out.println("La media es " + media + " insuficiente");
            System.out.println("Cual ha sido el resultado de la recuperación apto/no apto");
            String rec = teclado.next();
            if (rec.equals("apto")) {
                System.out.println("Su nota de Programación es un 5");
            } else System.out.println("La nota de Programación es " + media);
            }
        }
}

package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej7_mediatresnotasboletin {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la nota 1");
        double nota1 = teclado.nextInt();

        System.out.println("Introduzca la nota 2");
        double nota2 = teclado.nextInt();

        System.out.println("Introduzca la nota 3");
        double nota3 = teclado.nextInt();

        double resultado = ((nota1 + nota2 + nota3) / 3);

        System.out.println("La nota media es " + resultado);

        if (resultado < 5) {
            System.out.println("Insuficiente");
        } else if (resultado >= 5 && resultado < 7) {
            System.out.println("Bien");
        } else if (resultado >= 7 && resultado < 8) {
            System.out.println("Notable bajo");
        } else if (resultado >= 8 && resultado < 9) {
            System.out.println("Notable alto");
        } else if (resultado >= 9 && resultado < 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Matrícula de honor");
        }
    }
}

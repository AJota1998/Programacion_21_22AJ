package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej6_mediatresnotas {
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
    }
}

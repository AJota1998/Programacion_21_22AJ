package T1.TEMA3.UNIDAD1.TAREA4;

import java.util.Scanner;

public class ej3_mediadosnotasentera {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la nota 1");
        float nota1 = teclado.nextFloat();

        System.out.println("Introducd la nota 2");
        float nota2 = teclado.nextFloat();

        float media = (int) ((nota1 + nota2) / 2);

        System.out.println("La media de " + nota1 + " y " + nota2 + " es " + media);
    }
}

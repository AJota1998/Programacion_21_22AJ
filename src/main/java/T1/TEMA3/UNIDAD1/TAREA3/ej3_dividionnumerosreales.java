package T1.TEMA3.UNIDAD1.TAREA3;

import java.util.Scanner;

public class ej3_dividionnumerosreales {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número real");
        float n1 = teclado.nextFloat();

        System.out.println("Introduzca otro número real");
        float n2 = teclado.nextFloat();

        float resultado = (n1 / n2);

        System.out.println("La división de " + n1 + " entre " + n2 + " es " + resultado);
    }
}

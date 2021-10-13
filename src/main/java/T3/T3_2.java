package T3;

import java.util.Scanner;

public class T3_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca año nacimiento");
        int fechanaci = teclado.nextInt();

        System.out.println("Introduzca año actual");
        int fechahoy = teclado.nextInt();

        int op = (fechahoy - fechanaci);

        System.out.println("Su edad es " + op);
    }
}

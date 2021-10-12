package T6;

import java.util.Scanner;

public class T6_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int numero = teclado.nextInt();

        int variable;
        if ((numero % 2) == 0) {
            variable = 1;
            System.out.println("Es par " + variable);
        } if ((numero % 2) != 0) {
            variable = 0;
            System.out.println("Es impar " + variable);
        }
    }
}

package T1.TEMA3.T8B;

import java.util.Scanner;

public class T9B_8 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dia 1 (1-7)");
        int dia1 = teclado.nextInt();

        while (dia1 < 1 || dia1 > 7) {
            System.out.println("Día erróneo");
            System.out.println("Introduce un día válido");
            dia1 = teclado.nextInt();

        }
        System.out.println("Introduce la hora del día 1 (0-23)");
        int h1 = teclado.nextInt();

        while (h1 < 0 || h1 > 23) {
            System.out.println("Hora errónea");
            System.out.println("Introduzca una hora válida");
            h1 = teclado.nextInt();
        }
        System.out.println("Introduzca el segundo día");
        int dia2 = teclado.nextInt();

        while (dia2 < dia1 && dia2 < 0 || dia2 > 7) {
            System.out.println("Día erróneo");
            System.out.println("Introduzca un día válido");
            dia2 = teclado.nextInt();
        }
        System.out.println("Introduzca la hora del día 2");
        int h2 = teclado.nextInt();

        while (h2 < 0 || h2 > 23) {
            System.out.println("Hora errónea");
            System.out.println("Introduce una hora válida");
            h2 = teclado.nextInt();
        }
        System.out.println("Hay " + ((dia2 * 24 - h2) - (dia1 * 24 - h1)) + " horas entre ambos días");

    }
}

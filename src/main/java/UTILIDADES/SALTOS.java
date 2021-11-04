package UTILIDADES;

import java.util.Scanner;

public class SALTOS {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = teclado.nextInt();
        System.out.print("Introduzca un salto: ");
        int salto = teclado.nextInt();

        while (salto < 0 || salto > 2) {
            System.out.print("Introduzca un salto: ");
            salto = teclado.nextInt();
        }

        int cociente = n;
        int invertido = 0;

        while (cociente > 0) {
            invertido = invertido * 10 + cociente % 10;
            cociente = cociente / 10;
        }

        cociente = invertido;
        n = 0;

        int a_saltar = 0;

        while (cociente != 0) {
            if (a_saltar == 0) {
                n = n * 10 + cociente % 10;
                cociente = cociente / 10;
                a_saltar = salto;
            } else {
                cociente = cociente / 10;
                a_saltar--;
            }
        }

        System.out.println("Resultado = " + n);

    }
}

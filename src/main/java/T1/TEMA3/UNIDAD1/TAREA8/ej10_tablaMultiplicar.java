package T1.TEMA3.UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej10_tablaMultiplicar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número del 1 al 10");
        int numero = teclado.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.println("Intoduzca un número entre 1 y 10");
            numero = teclado.nextInt();
        }

        System.out.println("Tabla del " + numero);
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " " + (numero*i));
        }
    }
}

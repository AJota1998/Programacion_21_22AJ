package UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej15_numerosPrimoEntreRango {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();

        int primo = 0;
        int no_primo = 0;

        for (int i = 1; i < numero ; i++) {
            if (numero % i == 0) {
                no_primo++;
            } else {
                primo++;
            }

        }

        System.out.println("Número de primos entre 1 y " + numero + ": " + primo);
        System.out.println("Número de no primos entre 1 y " + numero + ": " + no_primo);
    }
}

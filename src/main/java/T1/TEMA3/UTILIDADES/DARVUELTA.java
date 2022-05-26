package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class DARVUELTA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        int aux;
        int cifra = 0;
        int inverso = 0;

        aux = numero;

        while (aux != 0) {
            cifra = aux % 10;
            inverso = (inverso * 10) + cifra;
            aux = aux / 10;
        }
        System.out.println(inverso);
    }
}
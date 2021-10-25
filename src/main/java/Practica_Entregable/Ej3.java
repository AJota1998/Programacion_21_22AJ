package Practica_Entregable;

import java.util.Scanner; //convertir a binario

public class Ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        int aux;
        int cifra;
        int numerobi = 0;

        aux = n;
            while (aux != 0) {

            cifra = aux % 2;
            numerobi = (numerobi * 10) + cifra;
            aux = aux / 2;
                System.out.println(aux);
                System.out.println(cifra);
                System.out.println(numerobi);
                System.out.println(aux);
        }
        System.out.println(n + " en binario es " + numerobi);
    }
}

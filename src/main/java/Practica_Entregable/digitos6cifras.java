package Practica_Entregable;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class digitos6cifras {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de 6 cifras");
        int numero = teclado.nextInt();

        while (numero < 100000 || numero > 999999) {
            System.out.println("Introduce un número válido");
            numero = teclado.nextInt();
        }

        int aux;
        int cifra = 0;
        int inverso = 0;

        aux = numero;
        int variable = 0;
        int contador = 0;
        //esto coge cada cifra de un número
        while (contador < 3) {
            cifra = aux % 10;
            inverso = (inverso * 10) + cifra;
            aux = aux / 10;
            contador++;
        }
        System.out.println(aux);
        System.out.println(inverso);

        int aux2;
        int cifra2 = 0;
        int inverso2 = 0;

        while (inverso != 0) {
            cifra2 = inverso % 10;
            inverso2 = (inverso2 * 10) + cifra2;
            inverso = inverso / 10;
        }
        System.out.println(inverso2);

        boolean esprimo = true;
        for (int i = 2; i < aux; i++) {
            if (aux % i == 0) {
                esprimo = false;
                break;
            }

        }
        if (esprimo) {
            System.out.println("el número " + aux + " es primo ");
        } else {
            System.out.println("el número " + aux + " no es primo");
        }
    }
}

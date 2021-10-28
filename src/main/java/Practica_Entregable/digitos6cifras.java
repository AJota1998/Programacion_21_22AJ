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

            //ahora lo termino, tengo que darle la vuelta al 654




    }
}

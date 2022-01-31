package YOUTUBE.DosnumerosTRES;

import java.util.Scanner;

public class Operacion {
    Scanner teclado = new Scanner(System.in);

    //No es obligatorio que todas las clases tengan atributos, pueden tener solo metodos, o solo atributos, o los dos.

    //Metodos con PARAMETROS que estamos utilizando para la declaración de ellos 

    //metodo sumar

    public int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    //metodo restar

    public int restar(int n1, int n2) {
        int resta = n1 - n2;
        return resta;
    }

    //metodo multiplicar

    public int multiplicar(int n1, int n2) {
        int multiplicacion = n1 * n2;
        return multiplicacion;
    }

    //metodo dividir

    public int dividir(int n1, int n2) {
        int division = n1/n2;
        return division;
    }

    //metodo mostrar resultado

    public void resultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}

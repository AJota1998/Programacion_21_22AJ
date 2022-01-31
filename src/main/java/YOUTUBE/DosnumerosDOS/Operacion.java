package YOUTUBE.DosnumerosDOS;

import java.util.Scanner;

public class Operacion {
    Scanner teclado = new Scanner(System.in);

    //Atributos

    int suma;
    int resta;
    int  multiplicacion;
    int division;

    //Metodos con PARAMETROS que estamos utilizando para la declaración de ellos

    //metodo sumar

    public void sumar(int n1, int n2) {
        suma = n1 + n2;
    }

    //metodo restar

    public void restar(int n1, int n2) {
        resta = n1 - n2;
    }

    //metodo multiplicar

    public void multiplicar(int n1, int n2) {
        multiplicacion = n1 * n2;
    }

    //metodo dividir

    public void dividir(int n1, int n2) {
        division = n1/n2;
    }

    //metodo mostrar resultado

    public void resultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}

package T1.TEMA3.YOUTUBE.Dosnumeros;

import java.util.Scanner;

public class Operacion {
    Scanner teclado = new Scanner(System.in);

    //Atributos

    int n1;
    int n2;
    int suma;
    int resta;
    int  multiplicacion;
    int division;

    //Metodos

    //metodo pedir usuario introduzca 2nº

    public void introducirnumeros() {
        System.out.println("Introduzca nº1");
        n1 = teclado.nextInt();
        System.out.println("Introduzca nº2");
        n2 = teclado.nextInt();
    }

    //metodo sumar

    public void sumar() {
        suma = n1 + n2;
    }

    //metodo restar

    public void restar() {
        resta = n1 - n2;
    }

    //metodo multiplicar

    public void multiplicar() {
        multiplicacion = n1 * n2;
    }

    //metodo dividir

    public void dividir() {
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

package YOUTUBE.DosnumerosTRES;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca n1");
        int n1 = teclado.nextInt();
        System.out.println("Introduzca n2");
        int n2 = teclado.nextInt();

        Operacion op = new Operacion();

        //estamos guardando dentro de variables de la clase main los RETORNOS de los metodos,
        //recuerda que no los hemos declarado VOID, sino del tipo int en este caso para que nos devuevan valores

        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);

        //si te fijas, esto es un ejemplo en el que pasamos las variables que hemos asignado en main
        //con los valores de retorno de los metodos.
        //esto nos sirve para parsarle ahora los argumentos al llamado del metodo resultados
        //es una manera practica de realizarlo

        op.resultados(suma, resta, multiplicacion, division);

        //otra forma de mostrar los resultados es con un sout y concatenamos el metodo con el valor que nos devuelve
        //de esta manera no imprimimos la variable local suma, resta, etc sino el valor del retorno del llamado al metodo

        System.out.println("\nLa suma es:" + op.sumar(n1, n2));
        System.out.println("La resta es " + op.restar(n1, n2));
        System.out.println("La multiplicación es: " + op.multiplicar(n1, n2));
        System.out.println("La división es: " + op.dividir(n1, n2));
    }
}

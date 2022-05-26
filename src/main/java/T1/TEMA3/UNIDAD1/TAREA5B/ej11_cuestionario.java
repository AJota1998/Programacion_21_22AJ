package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej11_cuestionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---Bienvenidos al cuestionario AJ---");
        System.out.println();

        int contador = 0;
        int respuesta = 0;

        System.out.println("P1 Número de mundiales ganados por Fernando Alonso: \n -1-, -2-, -4-");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 2");
        }

        System.out.println("P2 Número de mundiales ganados por Hamilton: \n -5-, -8-, -7-");
        respuesta = teclado.nextInt();
        if (respuesta == 7) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 7");
        }

        System.out.println("P3 Número de mundiales ganados por Vettel: \n -3-, -2-, -4-");
        respuesta = teclado.nextInt();
        if (respuesta == 4) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 4");
        }

        System.out.println("P4 Número de mundiales ganados por Raikkonen: \n -1-, -0-, -2-");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 1");
        }

        System.out.println("P5 Número de mundiales ganados por Villeneuve: \n -1-, -0-, -3-");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 1");
        }

        System.out.println("P6 Número de mundiales ganados por Bottas: \n -1-, -2-, -0-");
        respuesta = teclado.nextInt();
        if (respuesta == 0) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 0");
        }

        System.out.println("P7 Número de mundiales ganados por Hakkinen: \n -1-, -2-, -5-");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 2");
        }

        System.out.println("P8 Número de mundiales ganados por Piquet: \n -4-, -2-, -3-");
        respuesta = teclado.nextInt();
        if (respuesta == 3) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 3");
        }

        System.out.println("P9 Número de mundiales ganados por Lauda: \n -1-, -5-, -3-");
        respuesta = teclado.nextInt();
        if (respuesta == 3) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 3");
        }

        System.out.println("P10 Número de mundiales ganados por Hunt: \n -1-, -0-, -2-");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 1;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es 1");
        }
        System.out.println();
        System.out.println("El número de aciertos totales ha sido " + contador);
        System.out.println("---Gracias por jugar---");
    }
}

package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej15_parejainfiel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("---Bienvenido al cuestionario del amor---");

        int contador = 0;
        int respuesta = 0;

        System.out.println("P1 Su pareja parece estar más inquieta de lo normal 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P2 Ha aumentado su gasto en vestuario 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P3 Ha perdido el interés que mostraba en usted 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P4 Se afeita y asea con más frecuencia de lo normal 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P5 No te deja mirar la agenda de su móvil 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P6 A veces no contesta llamadas delante suya 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P7 Se preocupa más en cuidar la línea y estar bronceada 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P8 Viene tarde después de trabajar diciendo que tiene mucho trabajo 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P9 Ha notado que últimamente se pefuma más de lo habitual 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        System.out.println("P10 Se confunde y dice sitios donde no ha estado con ustes 1V, -1F");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            contador = contador + 3;
        }

        if (contador < 15 && contador > 9) {
            System.out.println("Resultado " + contador + " Su pareja parece ser que tiene algo sospechoso");
        } else if (contador > 15 && contador < 23) {
            System.out.println("Resultado " + contador + " Ojo cuidao que puede ser que te la estén metiendo doblá");
        } else if (contador > 23) {
            System.out.println("Resultado " + contador + " Churra, ve comprándote una funda pa los cuernos no vayas a pasar frío");
        } else {
            System.out.println("Resultado " + contador + " No debería preocuparse en exceso pero no baje la guardia");
        }
    }
}
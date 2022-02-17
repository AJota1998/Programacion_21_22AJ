package YOUTUBE.ABSTRACT.Poligonos;

import java.util.ArrayList;
import java.util.Scanner;

/*
Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos)
el programa debe ser capaz de almacenar en un array N triángulos y Rectángulos,
y al final mostrar el área y los datos de cada uno.
 */
public class main {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();

    public static void main(String[] args) {

        // llamada a llenar_poligono()
        llenar_poligono();
        //llamada a mostrar_resultados()
        mostrarResultados();
    }

    public static void llenar_poligono() {
        int opcion;
        char respuesta;

        do {
            do {
                System.out.println("Indique que polígono desea ");
                System.out.println("Opción 1: Triángulo ");
                System.out.println("Opción 2: Rectangulo ");
                System.out.println("Opción: ");
                opcion = teclado.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1: //metodo llenar triangulo
                    llenar_triangulo();
                    break;
                case 2: //metodo llenar rectangulo
                    llenar_rectangulo();
            }

            System.out.println("¿Desea introducir otro polígono? (S/N");
            respuesta = teclado.next().charAt(0);
            System.out.println();

        } while (respuesta == 'S' || respuesta == 's');
    }
    public static void llenar_triangulo() {
        double lado1, lado2, lado3;

        System.out.println("Introduzca lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.println("Introduzca lado 2: ");
        lado2 = teclado.nextDouble();
        System.out.println("Introduzca lado 3: ");
        lado3 = teclado.nextDouble();

        Triangulo Tri = new Triangulo(lado1, lado2, lado3);
        poligonos.add(Tri);
    }

    public static void llenar_rectangulo() {
        double lado1, lado2;

        System.out.println("Introduzca lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.println("Introduzca lado 2: ");
        lado2 = teclado.nextDouble();

        Rectangulo Rec = new Rectangulo(lado1, lado2);
        poligonos.add(Rec);
    }

    public static void mostrarResultados() {
        for (Poligono poli : poligonos) {
            System.out.println(poli.toString());
            System.out.println("Área: " + poli.area());
            System.out.println();
        }
    }
}

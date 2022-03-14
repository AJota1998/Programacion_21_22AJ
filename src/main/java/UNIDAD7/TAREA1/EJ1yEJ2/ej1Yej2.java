package UNIDAD7.TAREA1.EJ1yEJ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ej1Yej2 {
    public static void main(String[] args) {

        //creamos la lista
        ArrayList<Integer> lista = new ArrayList<>();

        //generamos 20 iteracciones de numeros aleatorios
        for (int i = 0; i < 20; i++) {
            lista.add((int) (1 + (Math.random() * 99)));
        }

        //imprimimos la lista
        for (Integer imprimir : lista) {
            System.out.println(imprimir);
        }
        System.out.println();

        //ordenamos la lista por defecto
        Collections.sort(lista);

        //volvemos a imprimir
        for (Integer imprimir : lista) {
            System.out.println(imprimir);
        }

        Comparator<Integer> compararDecreciente = Collections.reverseOrder();
        System.out.println();

        Collections.sort(lista, compararDecreciente);

        //imprimimos sentido decreciente
        for (Integer imprimir : lista) {
            System.out.println(imprimir);
        }
    }
}

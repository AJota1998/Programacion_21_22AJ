package T1.TEMA3.UNIDAD7.TAREA2.ej13;

import java.util.ArrayList;
import java.util.Collections;

//Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista, fusión de las dos anteriores.
//Desarrollar el algoritmo de forma no destructiva,
//es decir, que las listas utilizadas como parámetros de entrada se mantengan intactas.
public class ej13 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(7);
        lista1.add(5);
        lista1.add(3);
        lista1.add(9);

        lista2.add(4);
        lista2.add(2);
        lista2.add(10);
        lista2.add(8);
        lista2.add(6);

        System.out.println(ordenado(lista1, lista2));

        System.out.println(lista1);
        System.out.println(lista2);
    }
    public static ArrayList<Integer> ordenado(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> ordenado = new ArrayList<>();
        ordenado.addAll(l1);
        ordenado.addAll(l2);
        Collections.sort(ordenado);
        return ordenado;
    }
}

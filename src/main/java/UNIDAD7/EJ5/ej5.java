package UNIDAD7.EJ5;
//Crear una colección de 20 números enteros aleatorios distintos menores que 100,
//guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.
import java.util.*;

public class ej5 {
    public static void main(String[] args) {

        Comparator<Integer> comparador = Collections.reverseOrder();

        Set<Integer> lista = new TreeSet<>(comparador);

        while (lista.size() < 20) {
            lista.add((int) (1 + Math.random() * 99));
        }
        System.out.println(lista);
    }
}

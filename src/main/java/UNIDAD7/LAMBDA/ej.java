package UNIDAD7.LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ej {
    public static void main(String[] args) {

        System.out.println("---EJ1---");
        //ej1
        List<Integer> lista_aleatorios = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
        Integer numero = (int) (1 + Math.random() * 99);
        lista_aleatorios.add(numero);
        }

        lista_aleatorios.stream().filter(n -> esprimo(n)).forEach(System.out::println);

        System.out.println("\n" + lista_aleatorios.stream().mapToInt(Integer::intValue).filter(n -> esprimo(n)).sum() + " suma");
        System.out.println("\n" + lista_aleatorios.stream().mapToInt(Integer::intValue).filter(n -> esprimo(n)).min() + " minimo");
        System.out.println("\n" + lista_aleatorios.stream().mapToInt(Integer::intValue).filter(n -> esprimo(n)).max() + " maximo");
        System.out.println("\n" + lista_aleatorios.stream().mapToDouble(Integer::doubleValue).filter(n -> esprimo((int) n)).average() + " media");

        System.out.println("---EJ2---");
        //ej2
        System.out.println();
        lista_aleatorios.stream().filter(numero -> numero % 7 == 0).forEach(System.out::println);

        System.out.println("---EJ3---");
        //ej3
        List<Integer> lista1 = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            Integer numero = (int) (1 + Math.random() * 99);
            lista1.add(numero);
        }

        List<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            Integer numero = (int) (1 + Math.random() * 99);
            lista2.add(numero);
        }

        Stream.concat(lista1.stream(), lista2.stream()).distinct().sorted().forEach(System.out::println);


}
    public static boolean esprimo(int n) {
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}

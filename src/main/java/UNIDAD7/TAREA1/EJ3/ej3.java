package UNIDAD7.TAREA1.EJ3;

import java.util.ArrayList;

public class ej3 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        int num = (int) (1 + (Math.random() * 9));
        lista.add(num);

        for (int i = 0; i < 19; i++) {
            num = (int) (1 + (Math.random() * 9));
            for (int j = 0; j < lista.size(); j++) {
                if(lista.get(j) <= num) {
                    lista.add(j, num);
                    break;
                } else if (j == lista.size() - 1) {
                    lista.add(num);
                    break;
                }
            }
        }

        for (Integer imprimir: lista) {
            System.out.println(imprimir);
        }

    }
}

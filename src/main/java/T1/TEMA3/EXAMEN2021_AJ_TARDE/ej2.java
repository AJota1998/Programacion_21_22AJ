package T1.TEMA3.EXAMEN2021_AJ_TARDE;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {

        // creamos un array de 10 y otro con los índices
        int[] numero = new int[10];
        int [] indice = {0,1,2,3,4,5,6,7,8,9};

        //mi idea es guardar los pares en un array y los restantes en otro
        int [] numero2 = new int[1];
        int [] numero3 = new int [1];

        //relleno el array de números aleatorios entre 12 y 89
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (12 + Math.random() * 78);

        }

        //recorro el array comprobando si el numero del indice i es par y lo meto en un array si es y en el otro si no
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                numero2[i] = numero[i];
                Arrays.copyOf(numero2, numero2.length + 1);
            } else {
                numero3[i] = numero[i];
            }

        }
        //ahora crearía un array donde se unifiquen los dos para imprimirlos junto con el indice


    }
}

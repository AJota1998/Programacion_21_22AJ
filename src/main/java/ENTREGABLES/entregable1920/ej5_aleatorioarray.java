package ENTREGABLES.entregable1920;

import java.util.Arrays;

public class ej5_aleatorioarray {
    public static void main(String[] args) {

        int [] a = {11,22,33,44,55,66,77,88,99,100};

        System.out.println(aleatorioDeArray(a));
    }

    public static int aleatorioDeArray(int[] a) {
        int aleatorio = a[(int) (Math.random() * a.length + 1)];

        return aleatorio;
    }
}

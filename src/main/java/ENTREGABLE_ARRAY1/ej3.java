package ENTREGABLE_ARRAY1;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {


        int []array = {1, 57, 78, 745, 2, 1, 98, 79, 7, 60};

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 999);
        }
    }
    public int[] filtraCon7(int []array) {

        int []array7 = new int[10];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 10 == 7)
            || (array[i] % 100 == 7)
            || (array[i] % 1000 == 7)) {
                array7[i] = array[i];
                array7 = Arrays.copyOf(array7, array7.length - 1);
            }
        }
        return array7;
    }
}

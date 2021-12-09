package entregable21_22AJ;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {

        int[] v1 = {2, 4, 0, 7, 9, 2, 9};
        int[] v2 = {1, 7, 2, 7, 6, 2};
        int pos = 4;
        int[] vfinal = insertarEnVector(v1,v2,pos);

        System.out.println(Arrays.toString(vfinal));
    }
    public static int[] insertarEnVector(int[] v1, int [] v2, int pos) {
        int[] v3 = new int[0];
        int cont = 0;
        int cont2 = 0;

            if (pos < 0) {
                v3 = v1;
            } else if (pos > v1.length) {
                v3 = v2;
            } else {
                v3 = new int[v1.length + v2.length];

            for (int i = 0; i < v3.length; i++) {
                if (i < pos) {
                    v3[i] = v1[i];
                    cont2++;
                } else if (i >= pos && i < (pos + v2.length)) {
                    v3[i] = v2[cont];
                    cont++;
                } else {
                    v3[i] = v1[cont2];
                    cont2++;
                }
            }
        }
        return v3;
    }
}

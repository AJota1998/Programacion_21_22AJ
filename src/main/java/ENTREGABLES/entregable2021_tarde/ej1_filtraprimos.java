package ENTREGABLES.entregable2021_tarde;

import java.util.Arrays;

public class ej1_filtraprimos {
    public static void main(String[] args) {

        int []a = {2, 7, 31, 87, 9};

        System.out.println(Arrays.toString(filtraprimos(a)));

    }
    public static int[] filtraprimos (int []a) {

        int[] primofiltrao = new int[0];
        int aux;
        boolean esprimo = true;
        int cifra = 0;
        int primo = 0;

        for (int i = 0; i < a.length; i++) {
            aux = a[i];
            for (int j = 2; j < a[i]; j++) {
                if (aux % j == 0) {
                    esprimo = false;
                    break;
                } else {
                    esprimo = true;
                }
            }
            if (esprimo) {
                primo = a[i];
                primofiltrao = Arrays.copyOf(primofiltrao, primofiltrao.length + 1);
                primofiltrao[cifra] = primo;
                cifra++;
        }


        }
        return primofiltrao;
    }
}

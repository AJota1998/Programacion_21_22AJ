package ENTREGABLES.entregable1920;

import java.util.Arrays;

public class ej3_cogercifraarrays {
    public static void main(String[] args) {
        // Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
        // lo que se especifica en los comentarios:
        //
        // public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
        //                                 // que contienen el 7 (por ej. 7, 27, 782)
        //                                 // que se encuentren en otro array que se
        //                                 // pasa como parámetro. El tamaño del array
        //                                 // que se devuelve será menor o igual al
        //                                // que se pasa como parámetro.
        //
        // Utiliza esta función en un programa para comprobar que funcionan bien. Para
        // que el ejercicio resulte más fácil, las repeticiones de números que contienen
        // 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
        // el array devuelto también estará repetido 3 veces. Si no existe ningún número
        // que contiene 7 en el array x, se devuelve un array con el número -1 como único
        // elemento.

        int[] tendraSiete = {7,53,8,658,147,77,56,23,34,97};

        System.out.println(Arrays.toString(filtraCon7(tendraSiete)));
    }

    public static int[] filtraCon7(int[] x){
        int resto;
        int divisor = 0;
        int aux;
        int[] nuevoX = new int[0];
        boolean siete_esta = false;
        int suma = 1;
        int cifra = 0;

        for (int i = 0; i < x.length; i++) {
            aux = x[i];
            do {
                resto = aux % 10;
                aux = aux / 10;
                if (resto == 7){
                    siete_esta = true;
                    divisor = x[i];
                    break;
                } else {siete_esta = false;}
            } while (aux > 0);

            if (siete_esta) {
                nuevoX = Arrays.copyOf(nuevoX,nuevoX.length + suma);
                nuevoX[cifra] = divisor;
                cifra++;
            }

        }

        return nuevoX;
    }

}

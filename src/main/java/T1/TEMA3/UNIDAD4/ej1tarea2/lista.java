package T1.TEMA3.UNIDAD4.ej1tarea2;

import java.util.Arrays;

public class lista {

    public Integer[] lista1 = new Integer[10];
    public int size = 10;
    public int indice = 0;

    //constructor con el array de tipo Integer
    public lista(Integer[] lista1) {
    }

   //constructor con solo el tamaño
    public lista(int size) {
    }

    //insertar número al final
    public void fin(Integer[] lista1) {
        lista1 = Arrays.copyOf(lista1, lista1.length + 1);
        lista1[lista1.length - 1] = 10;
    }

   // metodo mostrar los elementos del array
    public void imprimir(int[] lista1) {
       for (int i = 0; i < lista1.length; i++) {
           System.out.println(lista1[i]);
       }
    }
}

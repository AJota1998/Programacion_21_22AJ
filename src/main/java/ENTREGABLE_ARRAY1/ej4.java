package ENTREGABLE_ARRAY1;

public class ej4 {
    public static void main(String[] args) {

        int []a = {1, 56, 21, 19, 75, 4, 19};

        System.out.println(convierteArrayEnString(a) + " ");
    }
    public static String convierteArrayEnString(int[] a) {
        String cadena = "";
        for (int i = 0; i < a.length; i++) {
            cadena += (a[i]);
        }
        return cadena;
    }
}

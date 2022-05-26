package T1.TEMA3.UNIDAD1.TAREA3;

import java.util.Scanner;

public class ej4_millaskilometros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una longitud en millas");
        float millas = teclado.nextFloat();

        final float kilometro = 1609f;

        float resultado = (millas * kilometro);

        System.out.println(millas + " millas son " + resultado + " kilómetros");
    }
}

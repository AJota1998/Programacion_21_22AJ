package T1.TEMA3.UNIDAD1.TAREA2;

import java.util.Scanner;

public class ej4_millasmetro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una longitud en millas");
        int millas = teclado.nextInt();

        final int metros = 1609;

        int equivalencia = (millas * metros);

        System.out.println(millas + " millas son " + equivalencia + " metros");
    }
}

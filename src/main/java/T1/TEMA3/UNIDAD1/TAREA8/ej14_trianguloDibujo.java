package T1.TEMA3.UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej14_trianguloDibujo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int altura = teclado.nextInt();

        for (int i = altura; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

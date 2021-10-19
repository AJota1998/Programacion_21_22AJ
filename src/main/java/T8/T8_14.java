package T8;

import java.util.Scanner;

public class T8_14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int altura = teclado.nextInt();

            for (int nasterisco = altura; nasterisco > 0; nasterisco--) { //Este bucle pinta los asteriscos en la fila

                for (int j = nasterisco; j > 0; j--) {
                    System.out.print(" * ");
                }
            System.out.println(" ");
            }
    }

}

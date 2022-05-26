package T1.TEMA3.UNIDAD1.TAREA5;

import java.util.Scanner;

public class ej1_positivoono {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}

package T1.TEMA3.UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej8_numeroYsuFactorial {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        long factorial = 1;

        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número:");
        int num = numero.nextInt();


        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}

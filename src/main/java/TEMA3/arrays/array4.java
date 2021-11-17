package TEMA3.arrays;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una longitud de dígitos de clave");
        int digi = teclado.nextInt();
                                                        //meter la clave en un array
        double combinacion = (1 + Math.random() * 6);
        System.out.println(combinacion);
    }
}

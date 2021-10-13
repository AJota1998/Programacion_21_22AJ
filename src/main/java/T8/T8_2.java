package T8;

import java.util.Scanner;

public class T8_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        double media = 0;
        int mayores = 0;


        do {
            System.out.println("Introduzca la edad");
            edad = teclado.nextInt();
            edad += edad;
            media ++;
            System.out.println("Suma de las edades es " + edad);
            System.out.println("La media de edad es " + (edad / media));
            if (edad > 18) {
            mayores ++;
            }
            System.out.println("Los mayores de 18 son " + mayores);
        } while (edad > 0);
    }
}

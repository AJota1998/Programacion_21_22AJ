package T1.TEMA3.UTILIDADES.INTERNET;

import java.util.Scanner;

public class eJ2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es " + numero1);
        } else if(numero1 < numero2) {
            System.out.println("El número mayor es " + numero2);
        } else {
            System.out.println("Son iguales");
        }
    }
}

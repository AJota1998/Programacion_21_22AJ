package T8B;

import java.util.Scanner;

public class T8B_7 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de 4 cifras");
        int numero = teclado.nextInt();

        int n1 = numero / 10;
        int n2 = numero / 100;
        int n3 = numero / 1000;
        int n4 = numero / 10000;



    }
}

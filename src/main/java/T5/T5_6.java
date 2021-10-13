package T5;

import java.util.Scanner;

public class T5_6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor del tiempo");
        int tiempo = teclado.nextInt();

        final float gravedad = 9.8f;

        float op = (tiempo * gravedad);

        if (tiempo > 0) {
            System.out.println("La velocidad es igual a " + op);
        } else
            System.out.println("Error");
    }
}

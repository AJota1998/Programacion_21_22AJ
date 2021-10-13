package T2;

import java.util.Scanner;

public class T2_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca los grados centígrados");
        int gradosC = teclado.nextInt();

        int gradosF = ((9 * gradosC / 5) + 32);

        System.out.println(gradosC + " Grados celsius son " + gradosF + " Grados Farenheit");
    }
}

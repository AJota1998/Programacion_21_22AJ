package T1.TEMA3.UTILIDADES;

import java.util.Scanner;

public class CAPICUA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        long n = teclado.nextLong();
        long cociente = n;
        long resto = 0;
        long rev = 0;

        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            rev = (rev * 10) + resto;
            System.out.println(rev);
        }

        if (n == rev) {
            System.out.println("El numero " + n + " es CAPICUA");
        } else {
            System.out.println("El numero " + n + " NO es CAPICUA");
        }
    }
}

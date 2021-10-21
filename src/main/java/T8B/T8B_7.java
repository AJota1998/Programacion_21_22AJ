package T8B;
import java.util.Scanner;

public class T8B_7 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");

        long numero = teclado.nextLong();
        long cociente = numero;
        long ninver = 0;

            while (cociente != 0) {
                ninver = (ninver * 10) + (cociente % 10);
                cociente = cociente / 10;

            }System.out.println("El número invertido es " + ninver);
    }
}

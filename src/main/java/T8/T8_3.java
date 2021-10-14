package T8;

import java.util.Scanner;

public class T8_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int Usu = 0;
        int maq = (int) (Math.random() * 100 + 1);

        while (Usu != -1 && Usu != maq) {

            System.out.println("Introduzca un número");
            Usu = teclado.nextInt();

            if (Usu > maq) {
            System.out.println("Es menor, sigue intentándolo");
            }
            if (Usu < maq) {
            System.out.println("Es mayor, sigue intentándolo");
            }
            if (Usu == maq) {
                System.out.println("Enhorabuena, los dos números coniciden");
                System.out.println("Máquina " + maq + " Usuario " + Usu);
            }

        }
    }
}

package T1.TEMA3.UNIDAD1.TAREA2;

import java.util.Scanner;

public class ej5_temperatura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una temperatura en grados centígrados");
        int centigrados = teclado.nextInt();

        int formula = (9 * centigrados / 5 + 32);

        System.out.println(centigrados + " centígrados son " + formula + " grados Fahrenheit");
    }
}

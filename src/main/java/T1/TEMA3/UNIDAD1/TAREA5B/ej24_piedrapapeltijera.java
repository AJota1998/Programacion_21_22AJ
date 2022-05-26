package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej24_piedrapapeltijera {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Turno del jugador 1");
        String j1 = teclado.next();

        System.out.println("Turno del jugador 2");
        String j2 = teclado.next();

        if (j1.equalsIgnoreCase("piedra") && j2.equalsIgnoreCase("papel")) {
            System.out.println("Gana el jugador 2");
        } else if (j1.equalsIgnoreCase("piedra") && j2.equalsIgnoreCase("tijeras")) {
            System.out.println("Gana el jugador 1");
        } else if (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("piedra")) {
            System.out.println("Gana el jugador 1");
        } else if (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("tijeras")) {
            System.out.println("Gana el jugador 2");
        } else if (j1.equalsIgnoreCase("tijeras") && j2.equalsIgnoreCase("papel")) {
            System.out.println("Gana el jugador 1");
        } else if (j1.equalsIgnoreCase("tijeras") && j2.equalsIgnoreCase("piedra")) {
            System.out.println("Gana el jugador 2");
        } else {
            System.out.println("Habéis empatado");
        }
    }
}

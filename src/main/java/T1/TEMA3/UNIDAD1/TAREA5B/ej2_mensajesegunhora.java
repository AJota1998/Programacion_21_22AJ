package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej2_mensajesegunhora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una hora (0-24)");
        int hora = teclado.nextInt();

        if (hora >= 21 || hora < 6) {
            System.out.println("Buenas noches, caballero");
        } else if (hora > 5 && hora < 13) {
            System.out.println("Buenos días, caballero");
        } else {
            System.out.println("Buenas tardes, caballero");
        }
    }
}

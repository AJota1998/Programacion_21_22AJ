package UNIDAD4.ej7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce la frecuancia rango 80-108");
        double frequsu = teclado.nextDouble();

        sintonizador f1 = new sintonizador(frequsu);

        // mostramos la información al usuario
        f1.informacion();

        // pedimos al usuario si desea subir, bajar o salir de la radio
        String movimiento = "";
        do {
            System.out.println("Para subir la frequencia introduzca ''up'', para bajarla ''down'', para salir ''exit''");
            movimiento = teclado.next();
            f1.movimientos(movimiento);
        } while (!movimiento.equalsIgnoreCase("exit"));
    }
}

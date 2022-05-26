package T1.TEMA3.UNIDAD1.TAREA5;

import java.util.Scanner;

public class ej6_mostrarvelocidad {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor del tiempo");
        int tiempo = teclado.nextInt();

        final float gravedad = 9.8f;
        float velocidad = gravedad * tiempo;

        if (tiempo > 0) {
            System.out.println("La velocidad es " + velocidad);
        } else {
            System.out.println("Tiempo incorrecto");
        }
    }
}

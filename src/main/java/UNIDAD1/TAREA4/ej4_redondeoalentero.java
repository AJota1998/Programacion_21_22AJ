package UNIDAD1.TAREA4;

import java.util.Scanner;

public class ej4_redondeoalentero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número decimal");
        float numero = teclado.nextFloat();

        float redondeo = (Math.round(numero));

        System.out.println(numero + " redondeado es " + redondeo);
    }
}

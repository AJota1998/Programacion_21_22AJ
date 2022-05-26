package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej1_asignaturaaprimerahora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el día de la semana");
        String dia = teclado.next();

        if (dia.equalsIgnoreCase("lunes")) {
            System.out.println("Programación");
        } else if (dia.equalsIgnoreCase("martes")){
            System.out.println("Base de datos");
        } else if (dia.equalsIgnoreCase("miercoles")) {
            System.out.println("Programación");
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("Programación");
        } else if (dia.equalsIgnoreCase("viernes")) {
            System.out.println("Base de datos");
        } else {
            System.out.println("Día incorrecto");
        }

    }
}

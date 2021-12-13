package UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej21_nomina {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qué cargo ocupa en la empresa: 1-progJunior, 2-ProgSenior, 3-jefeProyecto");
        int cargo = teclado.nextInt();

        System.out.println("Estado civil: 1-Soltero, 2-Casado");
        int estado = teclado.nextInt();

        System.out.println("Cuantos días ha estado de viaje");
        int viajes = teclado.nextInt();

        float sueldobase = 0;
        int dietas = (30 * viajes);


        if (cargo == 1) {
            sueldobase =  900;
        } else if (cargo == 2) {
            sueldobase = 1200;
        } else if (cargo == 3) {
            sueldobase = 1600;
        }

        float sueldobruto = sueldobase + dietas;
        float irpf = 0f;

        if (estado == 1) {
            irpf = (sueldobruto * 0.25f);
        } else {
            irpf = (sueldobruto * 0.20f);
        }

        System.out.println("---Desglose de la nómina---");
        System.out.println();
        System.out.println("Sueldo base: " + sueldobase);
        System.out.println("Dietas de viaje: " + dietas);
        System.out.println("Sueldo bruto: " + sueldobruto);
        System.out.println("IRPF: " + irpf);
        System.out.println("Sueldo neto: " + (sueldobruto - irpf));

    }
}

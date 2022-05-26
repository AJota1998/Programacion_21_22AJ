package T1.TEMA3.UNIDAD1.TAREA6;

import java.util.Scanner;

public class ej2_numerotexto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número escrito");
        String numero = teclado.next();

        switch (numero) {
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
                break;
            case "tres":
                System.out.println("3");
                break;
            case "cuatro":
                System.out.println("4");
                break;
            case "cinco":
                System.out.println("5");
                break;
            case "seis":
                System.out.println("6");
                break;
            case "siete":
                System.out.println("7");
                break;
            case "ocho":
                System.out.println("8");
                break;
            case "nueve":
                System.out.println("9");
                break;
            case "diez":
                System.out.println("10");
                break;
        }
    }
}

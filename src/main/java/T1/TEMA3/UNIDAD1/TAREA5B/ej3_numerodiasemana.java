package T1.TEMA3.UNIDAD1.TAREA5B;

import java.util.Scanner;

public class ej3_numerodiasemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un día de la semana (1-7)");
        int dia = teclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoy es Lunes");
            break;
            case 2:
                System.out.println("Hoy es Martes");
            break;
            case 3:
                System.out.println("Hoy es Miércoles");
            break;
            case 4 :
                System.out.println("Hoy es Jueves");
            break;
            case 5:
                System.out.println("Hoy es Viernes");
            break;
            case 6:
                System.out.println("Hoy es Sábado");
            break;
            case 7:
                System.out.println("Hoy es Domingo");
            break;
            default:
                System.out.println("Número no válido");
        }
    }
}

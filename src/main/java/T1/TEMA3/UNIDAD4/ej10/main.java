package T1.TEMA3.UNIDAD4.ej10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //creo el objeto Hora
        Hora hora1 = new Hora();

        //solicito los datos
        hora1.datos();

        //muestro la hora introducidad por el usuario
        hora1.mostrarhora();

        //solicito los segundos a añadir por el usuario
        hora1.addsegundos();

        //total de segundos de la hora introducida más los segundos añadir
        hora1.total_segundos();

        //hora expresada en formato 00-00-00
        hora1.hora_formato_tradicional();
    }
}

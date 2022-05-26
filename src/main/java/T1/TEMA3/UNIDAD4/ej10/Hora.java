package T1.TEMA3.UNIDAD4.ej10;

import java.util.Scanner;

public class Hora {
    Scanner teclado = new Scanner(System.in);

    int hora;
    int minutos;
    int segundos;
    int segundosadd;
    int segTotal;

    //pedir datos al usuario
    public void datos() {
        do {
            System.out.println("Introduzca la hora");
            hora = teclado.nextInt();
        } while (hora < 0 || hora > 23);
        do {
            System.out.println("Introduzca los minutos");
            minutos = teclado.nextInt();
        } while (minutos < 0 || minutos > 59);
        do {
            System.out.println("Introduzca los segundos");
            segundos = teclado.nextInt();
        } while (segundos < 0 || segundos > 3599);

    }

    //motrar la hora introducida por el usuario
   public void mostrarhora() {
       System.out.println("Son las " + hora + " horas " + minutos + " minutos " + segundos + " segundos");
   }


   //pasamos la hora a segundos
   public int pasar_a_segundos(int hora, int minutos, int segundos) {
        int hora_en_segundos = (((hora*60)*60) + (minutos*60) + segundos);
        return hora_en_segundos;
   }

   //solicitamos los segundos a añadir a la hora
   public void addsegundos() {
       System.out.println("Introduzca los segundos que desea añadir a la hora que ha introducido");
       segundosadd = teclado.nextInt();
   }

   public void total_segundos() {
        segTotal = pasar_a_segundos(hora, minutos, segundos) + segundosadd;
       System.out.println("Total en segundos de la hora introducida más los segundos añadidos " + segTotal);
   }

   public void hora_formato_tradicional() {
        this.minutos = 0;
        this.segundos = segTotal;
        this.hora = 0;
        while (segundos > 59) {
            segundos -=60;
            minutos++;
                if(minutos > 59) {
                    hora++;
                    minutos=0;
                }
            }
        mostrarhora();
   }

}

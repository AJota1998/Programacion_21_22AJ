package ENTREGABLE_21_22_AJ;

import java.util.Calendar;

public class obra {

String [] materiales = new String[0];
int indice_materiales = 0;

    //constructor
    public obra() {

    }

    private Calendar fecha;
    public void fecha_obra() {
        String dia, mes, annio;
        dia = Integer.toString(fecha.get(Calendar.DATE));
        mes = Integer.toString(fecha.get(Calendar.MONTH));
        annio = Integer.toString(fecha.get(Calendar.YEAR));
        System.out.println("Fecha: " + dia + "/" + (Integer.parseInt(mes) + 1) + "/" + annio);
    }

}

package UNIDAD5.ej3;

import UNIDAD5.ej2.Hora;

public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (this.segundos > 0 && this.segundos < 60) {
            this.segundos = segundos;
        }
    }
}

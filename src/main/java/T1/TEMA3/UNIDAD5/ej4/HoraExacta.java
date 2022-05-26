package T1.TEMA3.UNIDAD5.ej4;

import T1.TEMA3.UNIDAD5.ej2.Hora;

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


    public void son_iguales(int hora, int minuto, int segundos) {
        if (getHora() == hora && getMinuto() == minuto && getSegundos() == segundos) {
            System.out.println("Las horas son iguales");
        } else {
            System.out.println("Las horas no son iguales");
        }
    }
}

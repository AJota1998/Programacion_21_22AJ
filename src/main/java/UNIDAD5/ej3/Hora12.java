package UNIDAD5.ej3;

public class Hora12 extends Hora {

    public Hora12(int hora, int minuto) {
        super(hora, minuto);
    }

    public void formato12() {
        if (getHora() > 11) {
            setHora(getHora() - 12);
            if (getHora() != 0) {
                System.out.println("Son las " + getHora() + ":" + getMinuto() + " PM");
            } else {
                System.out.println("Son las " + getHora() + ":" + getMinuto() + " AM");
            }
        } else{
                System.out.println("Son las " + getHora() + ":" + getMinuto() + " AM");
            }
        }

    }

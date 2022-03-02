package ZZZPRACTICAS.FARA;

public class cajas {

    private int id = 1;
    private int capacidad;

    public cajas(int capacidad) {
        this.capacidad = capacidad;
        setCapacidad(capacidad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad < 0 || capacidad > 5) {
            this.capacidad = 0;
        } else {
            this.capacidad = capacidad;
        }
    }


}

package ZZZPRACTICAS.FARA;

import java.util.Arrays;

public class Cajas implements Comparable {

    private static Integer num_cajas = 0;
    private int id;
    private int capacidad;

    private Prendas[] arrayprendas = new Prendas[0];
    private Integer indice = 0;

    public Cajas(int capacidad) {
        setCapacidad(capacidad);
        setNum_cajas(getNum_cajas() + 1);
        setId(getNum_cajas());
    }

    public static Integer getNum_cajas() {
        return num_cajas;
    }

    public static void setNum_cajas(Integer num_cajas) {
        Cajas.num_cajas = num_cajas;
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
        if (capacidad < 0 || capacidad > 5) {
            this.capacidad = 0;
        } else {
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        return "Cajas{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                '}' + "contenido " + imprimirbien();
    }


    public void addprendas(Prendas prenda) {
        arrayprendas = Arrays.copyOf(arrayprendas, arrayprendas.length + 1);
        arrayprendas[indice] = prenda;
        indice++;
    }

    private String imprimirbien() {
        String imprimir = "";
        for (int i = 0; i < indice; i++) {
            imprimir += (arrayprendas[i].toString());
        }
        return imprimir;
    }

   //* @Override
    public int compareTo(Object o) {
        if(!(o instanceof Cajas))
            return 0;
        Cajas that  = (Cajas) o;
        return (getId() > that ) *//
    }

}

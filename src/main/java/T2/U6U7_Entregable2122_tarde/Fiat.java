package T2.U6U7_Entregable2122_tarde;

import java.io.Serializable;

public class Fiat extends Divisa implements Serializable {

    private String pais;

    public Fiat(String nombre, String simbolo, String pais) {
        super(nombre, simbolo);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", id=" + id +
                '}';
    }
}

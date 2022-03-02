package ZZZPRACTICAS.FARA;

import java.util.Arrays;

public class CamionCajas extends Vehiculo {

    public CamionCajas(String matricula, int cargamaxima, Conductor conductor) {
        super(matricula, cargamaxima, conductor);
    }

    private Cajas [] cajas = new Cajas[5];
    private Integer indice = 0;

    @Override
    public void descargar() {

    }

    public void add(Cajas caja) {
        if(indice < cajas.length) {
            cajas[indice++] = caja;
        } else {
            System.out.println("No tenemos espacio disponible en el camión");
        }
    }

    public void eliminar_caja(Cajas caja) {
        int var = 0;
        Cajas [] aux = new Cajas[cajas.length - 1];
        for (int i = 0; i < cajas.length; i++) {
            if(!caja.equals(cajas[i])) {
                aux[var] = cajas[i];
                var++;
            }
        }
        cajas = Arrays.copyOf(aux, aux.length);
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + imprimirbien() +
                ", matricula='" + matricula + '\'' +
                ", cargamaxima=" + cargamaxima +
                ", conductor=" + conductor +
                '}';
    }

    private String imprimirbien() {
        String imprimir = "";
        for (int i = 0; i < indice; i++) {
            imprimir+=(cajas[i].toString());
        }
        return imprimir;
    }
}

package ZZZPRACTICAS.FARA;

import java.util.Arrays;

public class CamionPerchas extends Vehiculo {

    public CamionPerchas(String matricula, int cargamaxima, Conductor conductor) {
        super(matricula, cargamaxima, conductor);
    }

    private PrendaColgada[] pColgadas = new PrendaColgada[0];
    private Integer indice = 0;

    @Override
    public void descargar() {

    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "matricula='" + matricula + '\'' +
                ", cargamaxima=" + cargamaxima +
                ", conductor=" + conductor +
                '}' + "contenido " + imprimirbien();
    }

    public void addprendacolgada(PrendaColgada pc) {
        pColgadas = Arrays.copyOf(pColgadas, pColgadas.length + 1);
        pColgadas[indice] = pc;
        indice++;
    }

    private String imprimirbien() {
        String imprimir = "";
        for (int i = 0; i < indice; i++) {
            imprimir += (pColgadas[i].toString());
        }
        return imprimir;
    }
}

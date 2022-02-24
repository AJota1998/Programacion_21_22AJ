package ZZZPRACTICAS.ENTREGABLE1;

import java.util.Arrays;
import java.util.Calendar;

public class Obra {

    private Vivienda vivi;
    private int indice;
    private Material[] mate=new Material[indice];
    private Material materialepa;
    private ManoDeObra Mano;
    private String Estancia;
    private Calendar fecha=Calendar.getInstance();
    private final String hora = Integer.toString(fecha.get(Calendar.HOUR));
    private final String min = Integer.toString(fecha.get(Calendar.MINUTE));
    private final String dia = Integer.toString(fecha.get(Calendar.DATE));
    private final String mes = Integer.toString(fecha.get(Calendar.MONTH));
    private final String anio = Integer.toString(fecha.get(Calendar.YEAR));
    private String fechadeObra;

    private int posicion;

    public Obra(Vivienda vivi,ManoDeObra Mano,String Estancia){
        this.vivi=vivi;
        this.Mano=Mano;
        this.Estancia=Estancia;
        this.fechadeObra="La obra se inicio el "+dia+"/"+mes+"/"+anio+" a las "+hora+":"+min+".";
    }


    //METODOS

    public void AgregoMaterial(Material materialepa){
        if (indice<mate.length){
            mate[indice++]=materialepa;
        }else {
            mate= Arrays.copyOf(mate,mate.length+1);
            mate[indice++]=materialepa;
        }

    }

    public void RestarMaterial(int posicion) {
        for (int i = 0; i < mate.length; i++) {
            if (mate[i] == mate[posicion]) {
                mate[i] = null;
                break;
            }
        }
    }


    public void mostrar_informacion(){
        System.out.println("La vivienda presenta la siguiente información: ");
        this.vivi.mostrar_informacion();
        System.out.println();
        System.out.println("La mano de obra presenta la siguiente información: ");
        this.Mano.mostrar_informacion();

        System.out.println("La estancia es: "+Obra.this.Estancia);
        System.out.println("Los materiales son:");
        System.out.println();
        for (int i = 0; i < indice; i++) {
            if (mate[i]!= null){
                System.out.println("Material "+(i+1)+":");
                mate[i].mostrar_informacion();}
        }
    }

    //SETTERS Y GETTERS

    public void setVivi(Vivienda vivi) {
        this.vivi = vivi;
    }

    public Vivienda getVivi() {
        return vivi;
    }

    public void setMano(ManoDeObra Mano) {
        this.Mano = Mano;
    }

    public ManoDeObra getMano() {
        return Mano;
    }

    public void setVivi(String Estancia) {
        this.Estancia = Estancia;
    }

    public String getEstancia() {
        return Estancia;
    }

}

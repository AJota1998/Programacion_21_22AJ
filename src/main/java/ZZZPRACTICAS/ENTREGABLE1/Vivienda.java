package ZZZPRACTICAS.ENTREGABLE1;

import java.util.Arrays;

public class Vivienda {

    private String direccion;
    private int m2;
    private int indice;
    private Estancias[] Lugares = new Estancias[indice];

    enum Estancias {
        SALON, COCINA, BANO, DORMITORIO, TERRAZA, VESTIBULO, COMEDOR, BALCON
    }

    private Estancias Estancia;


    public Vivienda(String direccion, int m2) {
        this.direccion = direccion;
        this.m2 = m2;
    }

    //METODOS

    public void AgregoEstancia(Estancias Estancia) {
        if (indice < Lugares.length) {
            Lugares[indice] = Estancia;
            indice++;
        } else {
            Lugares = Arrays.copyOf(Lugares, Lugares.length + 1);
            Lugares[indice++] = Estancia;
        }

    }

    public void RestarEstancia(Estancias Estancia) {
        for (int i = 0; i < Lugares.length; i++) {
            if (Lugares[i] == Estancia) {
                Lugares[i] = null;
                break;
            }
        }
    }

    public static void ImprimoEstancias() {
        for (Estancias habitasione : Estancias.values()) {
            System.out.println(habitasione);
        }
    }


    public void mostrar_informacion() {
        System.out.println("La dirección es: " + this.direccion);
        System.out.println("Ocupa un tamaño de: " + this.m2 + " m2");

        System.out.println("Las estancias son:");
        for (int i = 0; i < indice; i++) {
            System.out.print(Lugares[i] + " ");
        }
    }


    //SETTER Y GETTERS

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setm2(int m2) {
        this.m2 = m2;
    }

    public int m2() {
        return m2;
    }

}
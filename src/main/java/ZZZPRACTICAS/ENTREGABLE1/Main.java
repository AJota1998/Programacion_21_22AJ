package ZZZPRACTICAS.ENTREGABLE1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Material Madera = new Material("La madera arde facil","Madera&Brothers",20,50.5,20);
        ManoDeObra Carpinteros = new ManoDeObra("Aluminios Escalante","Se ocupan de todos los trabajos que requieran aluminio.",10,10);
        Vivienda Micasalol = new Vivienda("Yupilandia 23",300);
        Vivienda Amazon = new Vivienda("Holaquease 21",700);
        Vivienda Alixar = new Vivienda("Avenida de la Unidad 5",400);
        Obra McDonalds = new Obra(Micasalol,Carpinteros,"Un descampao");
        Obra Obra2banios = new Obra(Amazon,Carpinteros,"No sé");
        Obra Burguer_King = new Obra(Alixar,Carpinteros,"Si le sé");

        //OBRA 1

        Amazon.AgregoEstancia(Vivienda.Estancias.BANO);
        Amazon.AgregoEstancia(Vivienda.Estancias.BANO);
        Obra2banios.AgregoMaterial(Madera);
        Obra2banios.AgregoMaterial(Madera);
        Obra2banios.RestarMaterial(1);
        Material.setIVA(2000);
        Obra2banios.mostrar_informacion();
        System.out.println();

        //OBRA 2

        Micasalol.AgregoEstancia(Vivienda.Estancias.DORMITORIO);
        Micasalol.AgregoEstancia(Vivienda.Estancias.COMEDOR);
        McDonalds.AgregoMaterial(Madera);
        McDonalds.AgregoMaterial(Madera);
        McDonalds.RestarMaterial(0);
        Material.setIVA(20);
        McDonalds.mostrar_informacion();
        System.out.println();

        //OBRA 3
        Alixar.AgregoEstancia(Vivienda.Estancias.DORMITORIO);
        Alixar.AgregoEstancia(Vivienda.Estancias.COMEDOR);
        Burguer_King.AgregoMaterial(Madera);
        Burguer_King.AgregoMaterial(Madera);
        Burguer_King.RestarMaterial(1);
        Material.setIVA(20);
        Burguer_King.mostrar_informacion();

    }
}
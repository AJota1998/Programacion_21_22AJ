package UNIDAD8.ENTREGABLE2;

import UNIDAD8.ENTREGABLE1.RecorridoDOM;

import javax.xml.transform.TransformerException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws TransformerException {

        ModificarDOM dom1 = new ModificarDOM();

        dom1.parse("ficheros/coches.xml");
        dom1.imprimir();
        System.out.println();

        dom1.addcomentario();
        dom1.imprimir();
        System.out.println();

        dom1.addcoche();
        dom1.imprimir();
        System.out.println();

        dom1.reemplazarcoche();
        dom1.imprimir();
        System.out.println();

        dom1.volcar();

        ArrayList<Animal> listaAnimal = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Animal  a = new Animal("pepe", "12", "perro", "blanco");
            listaAnimal.add(a);
        }
        System.out.println(listaAnimal);
    }
}

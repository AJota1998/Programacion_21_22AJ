package YOUTUBE.CocheBarato;

import java.util.Scanner;

//dada una serie de vehículos caracterizados por marca, modelo y precio imprima las propiedades del más barato
//leeremos por teclado las caracterísitcas de cada vehículo.
public class main {
    public static int cochebarato(Coche coches[]) {
        double precio;
        int indice = 0;
        precio = coches[0].getPrecio();

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }

        }
        return indice;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String marca;
        String modelo;
        double precio;
        int numeroVehiculos;
        int indicebarato;

        System.out.println("Introduzca cuantos vehículos desea introducir");
        numeroVehiculos = teclado.nextInt();

        //creamos un array de tipo coche
        Coche coches[] = new Coche[numeroVehiculos];

        for (int i = 0; i < numeroVehiculos; i++) {
            System.out.println("Introduzca la marca");
            marca = teclado.next();
            System.out.println("Introduzca el modelo");
            modelo = teclado.next();
            System.out.println("Introduzca el precio");
            precio = teclado.nextDouble();
            coches[i] = new Coche(marca, modelo, precio);
        }
        indicebarato = cochebarato(coches);
        System.out.println("El coche más barato es: ");
        System.out.println(coches[indicebarato].mostrarInfo());


    }

}

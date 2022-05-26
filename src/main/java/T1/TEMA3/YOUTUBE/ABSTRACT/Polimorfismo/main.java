package T1.TEMA3.YOUTUBE.ABSTRACT.Polimorfismo;

public class main {
    public static void main(String[] args) {

        Vehiculo misvehiculos[] = new Vehiculo[4];

        //En el polimorfismo un objeto del tipo de la clase padre puede almacenar objetos del tipo
        //de sus clases hijas.

        misvehiculos[0] = new Vehiculo("1234GBJ", "Opel", "Corsa");
        misvehiculos[1] = new VehiculoTurismo(4, "23456JHY", "Ford", "Fiesta");
        misvehiculos[2] = new VehiculoDeportivo(2500, "5467FYK", "Honda", "Civic");
        misvehiculos[3] = new VehiculoFurgoneta(3000, "8765JDC", "Toyota", "Ranchera");

        for(Vehiculo Vehiculos : misvehiculos) {
            System.out.println(Vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}

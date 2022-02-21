package UNIDAD5.ej9;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Lavadora Lavadora1 = new Lavadora();
        //Estamos llamando a toSting, que es lo primero que busca por defecto.
        System.out.println(Lavadora1);

        Lavadora Lavadora2 = new Lavadora(250.50, 70.0);
        System.out.println(Lavadora2);

        Lavadora Lavadora10 = new Lavadora(210.50, 10.0);
        System.out.println(Lavadora2);

        Lavadora Lavadora11 = new Lavadora(400.50, 70.0);
        System.out.println(Lavadora2);

        Lavadora Lavadora12 = new Lavadora(190.80, 90.0);
        System.out.println(Lavadora2);


        Lavadora Lavadora3 = new Lavadora(8);
        System.out.println(Lavadora3);

        Lavadora Lavadora4 = new Lavadora(50);
        System.out.println(Lavadora4);


        Lavadora[] arrayLavadora = new Lavadora[4];
        arrayLavadora[0] = Lavadora1;
        arrayLavadora[1] = Lavadora2;
        arrayLavadora[2] = Lavadora3;
        arrayLavadora[3] = Lavadora4;

        System.out.println(" ");
        //imprimir el array
        imprimir(arrayLavadora);

        //Imprimir el array pero ordenado con el criterio por defecto
        Arrays.sort(arrayLavadora);
        System.out.println(" ");
        imprimir(arrayLavadora);

        //Imprimir el array con el criterio de la nueva clase que hemos creado
        Arrays.sort(arrayLavadora, new compararLavadoraPrecioFInal());
        System.out.println(" ");
        imprimir(arrayLavadora);

        Television t1 = new Television();
        Television t2 = new Television(100.0, Electrodomestico.enumcol.azul, Electrodomestico.enumcons.F, 50.0, 40, true);
        Television t3 = new Television(350.0, 60.0);
        System.out.println(" ");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        //Array de electrodomesticos

        Electrodomestico[] arrayElect = new Electrodomestico[10];

        arrayElect[0] = Lavadora1;
        arrayElect[1] = Lavadora2;
        arrayElect[2] = Lavadora3;
        arrayElect[3] = Lavadora4;
        arrayElect[4] = Lavadora10;
        arrayElect[5] = Lavadora11;
        arrayElect[6] = Lavadora12;
        arrayElect[7] = t1;
        arrayElect[8] = t2;
        arrayElect[9] = t3;

        imprimirElect(arrayElect);

    }
    public static void imprimir(Lavadora[] arrayLavadora) {

        for (Lavadora l: arrayLavadora) {
            System.out.println(l);
        }
    }
    public static void imprimirElect(Electrodomestico[] arrayElect) {
        for (Electrodomestico e: arrayElect) {
            System.out.println(e);
        }
    }
}

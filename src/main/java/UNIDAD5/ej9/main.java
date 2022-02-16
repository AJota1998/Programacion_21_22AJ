package UNIDAD5.ej9;

public class main {
    public static void main(String[] args) {

        Lavadora Lavadora1 = new Lavadora();
        //Estamos llamando a toSting, que es lo primero que busca por defecto.
        System.out.println(Lavadora1);

        Lavadora Lavadora2 = new Lavadora(250.50, 70.0);
        System.out.println(Lavadora2);

        Lavadora Lavadora3 = new Lavadora(8);
        System.out.println(Lavadora3);

        Lavadora Lavadora4 = new Lavadora(50);
        System.out.println(Lavadora4);

    }
}

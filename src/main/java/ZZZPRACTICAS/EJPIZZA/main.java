package ZZZPRACTICAS.EJPIZZA;

public class main {
    public static void main(String[] args) {

        Ingrediente Queso = new Ingrediente();
        Ingrediente Jamon_iberico = new Ingrediente("Jamón Ibérico",200);
        Ingrediente Pollo_a_la_parrilla = new Ingrediente("Pollo a la parrilla",100);

        Pizza p1 = new Pizza(Pizza.Size.Familiar);

        Pedido ped1 = new Pedido();

        Pizzeria pizze1=new Pizzeria();

        p1.AgregoIngrediente(Queso);

        p1.CantidadIngredientes();
        System.out.println();
        System.out.println("Informasion de pizzita");
        p1.Info();
        System.out.println();
        System.out.println("Informasion de pedío");
        ped1.mostrarInfo();

        System.out.println("Vamos a agrega a pisseria los pedidos");
        pizze1.AgregoPedido(ped1);
        pizze1.AgregoPedido(ped1);

        System.out.println("Ahora vamos a ver cuantos pedidos tiene y cuales:");

        pizze1.VerPedidos();
        System.out.println();
        pizze1.CantidadPedidos();
    }
}

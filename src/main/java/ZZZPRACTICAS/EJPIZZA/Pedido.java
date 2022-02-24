package ZZZPRACTICAS.EJPIZZA;

import java.util.Calendar;

public class Pedido {


    Calendar fecha = Calendar.getInstance();

    public Pizza getPizzita() {
        return pizzita;
    }

    private Pizza pizzita;
    private Pizza.Size Tamanio;
    private final Ingrediente[] Lista_ingre= new Ingrediente[2];
    private final String hora = Integer.toString(fecha.get(Calendar.HOUR));
    private final String min = Integer.toString(fecha.get(Calendar.MINUTE));
    private final String dia = Integer.toString(fecha.get(Calendar.DATE));
    private final String mes = Integer.toString(fecha.get(Calendar.MONTH));
    private final String anio = Integer.toString(fecha.get(Calendar.YEAR));

    private String FechaPedido = "El pedido se ha hecho a las " +hora+":"+min+" en "+dia+"/"+mes+"/"+anio;
    Ingrediente Queso = new Ingrediente();
    Ingrediente Jamon_iberico = new Ingrediente("Jamón Ibérico",200);

    public Pedido(Pizza pizzita){
        this.pizzita=pizzita;
        this.FechaPedido=FechaPedido;
    }

    public Pedido(){
        this.Tamanio= Pizza.Size.Familiar;
        this.Lista_ingre[0]=Queso;
        this.Lista_ingre[1]=Jamon_iberico;
        this.FechaPedido=FechaPedido;
        // this.pizzita = new Pizza()
        //CREA LA PIZZA
    }

    public void mostrarInfo(){
        System.out.println("La pizza tiene un tamaño: "+ this.Tamanio);
        System.out.println("La pizza tiene los siguientes ingredientes: ");
        for (int i = 0; i < Lista_ingre.length; i++) {
            System.out.print(Lista_ingre[i].MostrarInfo()+ " ");
        }
        System.out.println();
        System.out.println(FechaPedido);
    }
}

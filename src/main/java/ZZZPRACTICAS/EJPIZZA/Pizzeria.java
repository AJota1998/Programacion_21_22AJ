package ZZZPRACTICAS.EJPIZZA;

import java.util.Arrays;

public class Pizzeria {
    private int pedidos;
    private Pedido[] Espacios;
    private Pedido pedidillo;
    private int cantidadpedidos;


    public Pizzeria(int pedidos, Pedido pedidillo){
        this.pedidos=pedidos;
        Espacios=new Pedido[pedidos];
        this.pedidillo=pedidillo;
    }

    public Pizzeria() {
        this.pedidos=5;
        Espacios=new Pedido[pedidos];
    }


    // MÉTODOS

    public void AgregoPedido(Pedido pedidillo){
        if (cantidadpedidos<Espacios.length){
            Espacios[cantidadpedidos++]=pedidillo;
        } else {
            Espacios= Arrays.copyOf(Espacios, Espacios.length+1);
            Espacios[pedidos++]=pedidillo;
        }
    }


    public void VerPedidos(){
        System.out.println("Los pedidos realizados son:");
        for (int i = 0; i < cantidadpedidos; i++) {
            System.out.println("Pedido "+(i+1)+":");
            //      Espacios[i].getPizzita().Info();
            System.out.println(Espacios[i]);
        }
    }

    public void CantidadPedidos(){
        System.out.println("La cantidad de pedidos realizada es: "+cantidadpedidos);
    }
}

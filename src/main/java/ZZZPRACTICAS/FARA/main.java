package ZZZPRACTICAS.FARA;

public class main {
    public static void main(String[] args) {

        Cajas caja1 = new Cajas(5);
        Cajas caja2 = new Cajas(1);
        Cajas caja3 = new Cajas(5);
        Cajas caja4 = new Cajas(2);
        Cajas caja5 = new Cajas(6);

        Conductor conduc_camion1 = new Conductor("Juan", "correllano", "12345678H");
        CamionCajas camion1 = new CamionCajas("8765CNB", 500, conduc_camion1);

        camion1.add(caja1);
        camion1.add(caja2);
        camion1.add(caja3);
        camion1.add(caja4);
        System.out.println(camion1);
        System.out.println("---");
        camion1.eliminar_caja(caja3);
        System.out.println(camion1);
        System.out.println("---");

        Prendas prenda1 = new Prendas(40.50, "Chaleco del yuyu de cai", 198787, 80);
        Prendas prenda2 = new Prendas(55.50, "Chaleco de Fernando Alonso", 198124, 100);
        Prendas prenda3 = new Prendas(75.50, "Chaleco del comandante lara", 198201, 50);

        caja1.addprendas(prenda1);
        caja1.addprendas(prenda2);
        caja1.addprendas(prenda3);
        System.out.println(caja1);

        PrendaColgada pc1 = new PrendaColgada(51.90, "Sudadera justin bieber", 12355, 60, 30);
        PrendaColgada pc2 = new PrendaColgada(54.00, "Sudadera Rihana", 12665, 90, 35);
        PrendaColgada pc3 = new PrendaColgada(60.80, "Sudadera Negra", 12398, 80, 70);

        Conductor conduc2 = new Conductor("Alberto", "Orturo", "457765");
        CamionPerchas camiperchas1 = new CamionPerchas("7765LBN", 600, conduc2);

        camiperchas1.addprendacolgada(pc1);
        camiperchas1.addprendacolgada(pc2);
        camiperchas1.addprendacolgada(pc3);
        System.out.println(camiperchas1);
    }
}

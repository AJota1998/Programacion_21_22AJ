package ENTREGABLE_21_22_AJ;

public class main {
    public static void main(String[] args) {

        //objetos materiales
        material m1 = new material("Morse", "hierros san fernando", 12, 8, 21);
        material m2 = new material("Arena", "bricomart", 15, 9, 21);
        material m3 = new material("cemento", "bricodepot", 12, 5, 21);
        material m4 = new material("ladrillos", 500, 3, 21);
        material m5 = new material("tuberias", 25, 6, 21);

        //ejemplo de metodo de informacion
        m1.mostrar_informacion();

        //obtener iva actual
        System.out.println("El iva actual de los artículos es: " + m1.getIva());
        //modificar el iva
        System.out.println("\nVamos a modificarl el iva al 10 %");
        m1.setIva(10);
        //obtener el iva modificado
        System.out.println("\nIva actual: " + m1.getIva());

        //objetos mano_obra
        mano_obra trabajo1 = new mano_obra("Filesa", "hormigonado", 8, 2);
        mano_obra trabajo2 = new mano_obra("kalisot", "allanamiento", 40, 4);
        mano_obra trabjo3 = new mano_obra("Construcciones Da Silva", "levantamiento", 500, 10);

        //metodo informacion
        trabajo1.mostrar_informacion();

        vivienda viv1 = new vivienda("calle jaramago 17", 95, vivienda.estancias.balcon);
        vivienda viv2 = new vivienda("calle agapito iglesias, 56", 135, vivienda.estancias.cocina);
        vivienda viv3 = new vivienda("calle sufrimiento del programador, 5", 150, vivienda.estancias.salon);

        //imprimir estancias disponibles
        viv1.imprimir_estancias();

        //mostrar informacion
        viv1.mostrar_informacion();

        //objeto obra
        obra obra1 = new obra();



    }
}

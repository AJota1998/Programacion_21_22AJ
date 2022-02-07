package UNIDAD5.ej4;

public class main {
    public static void main(String[] args) {

        Hora h1 = new Hora(23, 50);

        h1.mostrar_hora();

        h1.incrementar_hora();

        h1.setMinuto(56);
        h1.setHora(12);

        h1.mostrar_hora();

        System.out.println(h1.toString());

        Hora12 h2 = new Hora12(8, 34);
        Hora12 h3 = new Hora12(20, 43);

        h2.formato12();
        h3.formato12();

        HoraExacta h4 = new HoraExacta(23, 56, 34);
        h4.setSegundos(76);

        HoraExacta h5 = new HoraExacta(21, 24, 10);
        h5.son_iguales(12,45,23);
    }
}

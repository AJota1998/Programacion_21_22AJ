package UNIDAD5.ej1;

public class main {
    public static void main(String[] args) {

        Hora h1 = new Hora(23, 50);

        h1.mostrar_hora();

        h1.incrementar_hora();

        h1.setMinuto(56);
        h1.setHora(12);

        h1.mostrar_hora();

        System.out.println(h1.toString());
    }
}

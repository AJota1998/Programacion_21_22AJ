package YOUTUBE.Dosnumeros;

public class main {
    public static void main(String[] args) {

        //creando el objeto de la clase operacion

        Operacion op1 = new Operacion();

        op1.introducirnumeros();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.dividir();
        op1.resultados();
    }
}

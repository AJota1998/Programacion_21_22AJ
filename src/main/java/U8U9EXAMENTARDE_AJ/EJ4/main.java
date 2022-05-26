package U8U9EXAMENTARDE_AJ.EJ4;

public class main {
    public static void main(String[] args) {

        Transacciones t1 = new Transacciones();

        t1.insertarLineaProducto();

        ConexBD.close();
    }
}

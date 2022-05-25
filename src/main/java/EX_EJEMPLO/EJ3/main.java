package EX_EJEMPLO.EJ3;

public class main {
    public static void main(String[] args) {

        Consultas cons = new Consultas();

        System.out.println(cons.getOffices());

        cons.convertToJSON();

        ConexBD.close();
    }
}

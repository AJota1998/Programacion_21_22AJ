package U8U9EXAMENTARDE_AJ.EJ3;

public class main {
    public static void main(String[] args) {

        Consultas con1 = new Consultas();

        System.out.println(con1.mostrarEmpleados());

        con1.convertToJSON();

        ConBD.close();
    }
}

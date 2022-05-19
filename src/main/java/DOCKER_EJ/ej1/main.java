package DOCKER_EJ.ej1;

import java.sql.Connection;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {

        ADclassicModels AD1 = new ADclassicModels();

        System.out.println(AD1.getEmpleados());

        System.out.println(AD1.getOffices());

        AD1.insertarCliente();

        AD1.AsignarEmpleadoCliente();

        //AD1.AsignarproductoApedido();


        ConexionBD.close();

    }
}

package DOCKER_EJ.ej1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADclassicModels {

    //Asignamos a una variable de la clase la propiedad de la conexión para usar en todos los metodos necesarios
    Connection con = ConexionBD.getConnection();

    public List getEmpleados() {

        List<Employee> ListaEmpleados = new ArrayList<>();

        try {
            //Creo el objeto para ejecutar la sentencias SQL
            Statement statement = con.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery("select * from employees");

            //Recorremos el conjunto de resultados
            while (rs.next()) {
               Employee e = new Employee(
                       rs.getInt("employeeNumber"),
                       rs.getString("lastName"),
                       rs.getString("firstName"),
                       rs.getString("extension"),
                       rs.getString("email"),
                       rs.getInt("officeCode"),
                       rs.getInt("reportsTo"),
                       rs.getString("jobTitle")
               );
               ListaEmpleados.add(e);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaEmpleados;

    }


    public List getOffices() throws SQLException {

        List<Office> ListaOficce = new ArrayList<>();

        try {
            //Creo el objeto para ejecutar la sentencias SQL
            Statement statement = con.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery("select * from offices");

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                Office o = new Office(
                        rs.getString("officeCode"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getString("addressLine1"),
                        rs.getString("addressLine2"),
                        rs.getString("state"),
                        rs.getString("country"),
                        rs.getString("postalCode"),
                        rs.getString("territory")
                );
                ListaOficce.add(o);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaOficce;
    }


}

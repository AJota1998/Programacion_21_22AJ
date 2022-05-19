package U9ENTREGABLE_AJ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    Connection con = ConexionBD.getConnection();

    public void insertarEmpleado() {
        try {
            String sql = "INSERT INTO employees (employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle)\n"
                    + "VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1,18);
            prepstatement.setString(2,"juliojuan");
            prepstatement.setString(3, "hulio");
            prepstatement.setString(4, "x9987");
            prepstatement.setString(5, "julio@gmail.com");
            prepstatement.setString(6, "5");
            prepstatement.setInt(7,1102);
            prepstatement.setString(8, "sales rep");

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        try {
            String sql = "INSERT INTO customers (customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1,890);
            prepstatement.setString(2,"manuel");
            prepstatement.setString(3, "hidalgo");
            prepstatement.setString(4, "manu");
            prepstatement.setString(5, "678456789");
            prepstatement.setString(6, "las marismas, 56");
            prepstatement.setString(7,"Jilguero, 56");
            prepstatement.setString(8, "sevilla");
            prepstatement.setString(9, "se");
            prepstatement.setString(10, "41679");
            prepstatement.setString(11, "Spain");
            prepstatement.setInt(12, 18);
            prepstatement.setDouble(13, 2100000);

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        try {
            String sql = "INSERT INTO customers (customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1,768);
            prepstatement.setString(2,"alberto");
            prepstatement.setString(3, "miraflores");
            prepstatement.setString(4, "albert");
            prepstatement.setString(5, "678456443");
            prepstatement.setString(6, "las marismas, 78");
            prepstatement.setString(7,"Jilguero, 98");
            prepstatement.setString(8, "sevilla");
            prepstatement.setString(9, "se");
            prepstatement.setString(10, "41679");
            prepstatement.setString(11, "Spain");
            prepstatement.setInt(12, 18);
            prepstatement.setDouble(13, 6700000);

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

package EX_EJEMPLO.EJ4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    Connection con = ConexionBD.getConnection();

    public void insertarPedido() {

        try {
            con.setAutoCommit(false);

            String sql = "INSERT INTO orders (orderNumber,orderDate,requiredDate,shippedDate,status,comments,customerNumber) "
                    + " VALUES (?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1,17500);
            prepstatement.setString(2,"2004-05-21");
            prepstatement.setString(3, "2004-05-28");
            prepstatement.setString(4, "2004-06-02");
            prepstatement.setString(5, "Shipped");
            prepstatement.setString(6, "Check on availability");
            prepstatement.setInt(7,103);

            prepstatement.executeUpdate();
            //
            String sql2 = "INSERT INTO orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber) "
                    + " VALUES (?,?,?,?,?);";
            PreparedStatement prep2 = con.prepareStatement(sql2);
            prep2.setQueryTimeout(30);

            prep2.setInt(1,17500);
            prep2.setString(2,"S10_1678");
            prep2.setInt(3,20);
            prep2.setDouble(4,56);
            prep2.setInt(5, 4);

            prep2.executeUpdate();
            //
            String sql3 = "INSERT INTO orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber) "
                    + " VALUES (?,?,?,?,?);";
            PreparedStatement prep3 = con.prepareStatement(sql3);
            prep3.setQueryTimeout(30);

            prep3.setInt(1,17500);
            prep3.setString(2,"S10_1949");
            prep3.setInt(3,26);
            prep3.setDouble(4,34);
            prep3.setInt(5, 1);

            prep3.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            try {
                if (con != null) {
                    System.out.println(
                            "Dejamos la BD en estado consistente. Ya se pueden hacer otros commits consistentemente.");
                    con.rollback();
                }
            } catch (SQLException throwables) {
                System.out.println("Error en el rollback.");
                throwables.printStackTrace();
            }
        }
    }
}

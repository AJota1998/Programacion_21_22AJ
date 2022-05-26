package U8U9EXAMENTARDE_AJ.EJ4;

import U9ENTREGABLE_AJ.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    Connection con = ConexionBD.getConnection();

    public void insertarLineaProducto() {

        try {
            con.setAutoCommit(false);

            String sql = "INSERT INTO productlines (productLine,textDescription,htmlDescription,image) "
                    + " VALUES (?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setString(1,"vintage Motorcycles");
            prepstatement.setString(2,"inserción correcta");
            prepstatement.setString(3,null);
            prepstatement.setString(4,null);

            prepstatement.executeUpdate();
            //
            String sql2 = "INSERT INTO products (productCode,productName,productLine,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP) "
                    + " VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement prep2 = con.prepareStatement(sql2);
            prep2.setQueryTimeout(30);

            prep2.setString(1,"S8500_2452");
            prep2.setString(2,"MOTOejemplo");
            prep2.setString(3,"vintage Motorcycles");
            prep2.setString(4,"1:700");
            prep2.setString(5,"Yamaha");
            prep2.setString(6,"Descripcion");
            prep2.setInt(7,67);
            prep2.setDouble(8,67.90);
            prep2.setDouble(9, 190.78);

            prep2.executeUpdate();
            //
            String sql3 = "INSERT INTO products (productCode,productName,productLine,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP) "
                    + " VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement prep3 = con.prepareStatement(sql3);
            prep3.setQueryTimeout(30);

            prep3.setString(1,"S8500_2453");
            prep3.setString(2,"MOTOejemplo");
            prep3.setString(3,"vintage Motorcycles");
            prep3.setString(4,"1:700");
            prep3.setString(5,"Honda");
            prep3.setString(6,"Descripcion");
            prep3.setInt(7,89);
            prep3.setDouble(8,12.90);
            prep3.setDouble(9, 130.79);

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

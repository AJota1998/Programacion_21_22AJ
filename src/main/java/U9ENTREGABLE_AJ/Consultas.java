package U9ENTREGABLE_AJ;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
    Scanner teclado = new Scanner(System.in);

    Connection con = ConexionBD.getConnection();

    public void filtroprecio() {
        System.out.println("Introduzca el precio");
        int precio = teclado.nextInt();

        try {
            String sql = "SELECT productName FROM products WHERE buyPrice > ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, precio);

            ResultSet rs = prepstatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("productName"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void infopagos() {
        System.out.println("Introduzca el número de cliente");
        int numerocliente = teclado.nextInt();
        System.out.println();

        try {
            String sql = "SELECT c.customerName, p.checkNumber, p.paymentDate, p.amount FROM customers c JOIN payments p ON c.customerNumber=p.customerNumber WHERE c.customerNumber = ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, numerocliente);

            ResultSet rs = prepstatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("customerName"));
                System.out.println(rs.getString("checkNumber"));
                System.out.println(rs.getString("paymentDate"));
                System.out.println(rs.getDouble("amount"));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void informecategoria() {
        System.out.println("Introduzca el nombre de la categoria");
        String nombrecategoria = teclado.next();

        try {
            String sql = "SELECT p.productName, o.quantityOrdered, o.priceEach FROM products p JOIN orderdetails o ON p.productCode=o.productCode WHERE p.productLine = ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setString(1, nombrecategoria);

            ResultSet rs = prepstatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("productName"));
                System.out.println(rs.getInt("quantityOrdered"));
                System.out.println(rs.getDouble("priceEach"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}

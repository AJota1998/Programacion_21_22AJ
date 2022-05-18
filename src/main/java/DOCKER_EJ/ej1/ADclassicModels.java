package DOCKER_EJ.ej1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Prepared statment va protegido por eso lleva los interrogantes
//Statment es una consulta normal

public class ADclassicModels {

    Scanner teclado = new Scanner(System.in);

    //Asignamos a una variable de la clase la propiedad de la conexión para usar en todos los metodos necesarios
    Connection con = ConexionBD.getConnection();

    List<Employee> ListaEmpleados = new ArrayList<>();
    public List getEmpleados() {

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


    List<Office> ListaOficce = new ArrayList<>();
    public List getOffices() throws SQLException {

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

    public void insertarCliente() {

        System.out.println("\n  - Introduzca los datos del cliente:");
        System.out.println("customerNumber: ");
        Integer customerNumber = teclado.nextInt();
        System.out.println("customerName: ");
        String customerName = teclado.next();
        System.out.println("contactLastName: ");
        String contactLastName = teclado.next();
        System.out.println("contactFirstName: ");
        String contactFirstName = teclado.next();
        System.out.println("phone: ");
        String phone = teclado.next();
        System.out.println("addressLine1: ");
        String addressLine1 = teclado.next();
        System.out.println("addressLine2: ");
        String addressLine2 = teclado.next();
        System.out.println("postalCode: ");
        String postalCode = teclado.next();
        System.out.println("city: ");
        String city = teclado.next();
        System.out.println("state: ");
        String state = teclado.next();
        System.out.println("country: ");
        String country = teclado.next();
        System.out.println("salesRepEmployeeNumber: ");
        Integer salesRepEmployeeNumber = teclado.nextInt();
        System.out.println("creditLimit: ");
        String creditLimit = teclado.next();

        try {
            String sql =
                    "INSERT INTO `customers` (`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`postalCode`,`city`,`state`,`addressLine2`,`country`,`salesRepEmployeeNumber`,`creditLimit`)\n"
                            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, customerNumber);
            prepstatement.setString(2, customerName);
            prepstatement.setString(3, contactLastName);
            prepstatement.setString(4, contactFirstName);
            prepstatement.setString(5, phone);
            prepstatement.setString(6, addressLine1);
            prepstatement.setString(7, postalCode);
            prepstatement.setString(8, city);
            prepstatement.setString(9, state);
            prepstatement.setString(10, addressLine2);
            prepstatement.setString(11, country);
            prepstatement.setInt(12, salesRepEmployeeNumber);
            prepstatement.setString(13, creditLimit);

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void AsignarEmpleadoCliente() {

        System.out.println("Introduzca el ID del EMPLEADO: ");
        Integer idemp = teclado.nextInt();
        System.out.println("Introduzca el ID del CLIENTE: ");
        Integer idcli = teclado.nextInt();

        Boolean existeemp = false;

        for (Employee e : ListaEmpleados) {
            if (idemp.equals(e.getEmployeeNumber())) {
                existeemp = true;
            }
        }

        Boolean existecli = false;

        try {
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select customerNumber from customers where customerNumber = " + idcli + "");
            while (rs.next()) {

                rs.getInt("customerNumber");

                if (rs.getInt("customerNumber") == idcli) {
                    existecli = true;
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        if (existecli && existeemp) {

            try {

                String sql = "UPDATE customers SET salesRepEmployeeNumber = " + idemp + " WHERE customerNumber = " + idcli + "";
                PreparedStatement prepstatement = con.prepareStatement(sql);
                prepstatement.setQueryTimeout(30);

                prepstatement.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("ERROR: ALGUNO DE LOS CAMPOS NO EXISTE");
        }
    }

    public void AsignarproductoApedido() {

        System.out.println("Introduzca el ID del Producto: ");
        String idproducto = teclado.next();
        System.out.println("Introduzca el ID del Pedido: ");
        Integer idpedido = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el orderLineNumber");
        Integer ordlnb = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el priceEach");
        Double priceeach = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduzca el quantity Ordered");
        Integer qord = teclado.nextInt();
        teclado.nextLine();

        Boolean existeproducto = false;

        Boolean existepedido = false;

        try {
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select productCode from products where productCode = " + idproducto + "");
            while (rs.next()) {

                if (rs.getString("productCode") == idproducto) {
                    System.out.println("idproducto");
                    existeproducto = true;
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select orderNumber from orderdetails where orderNumber = " + idpedido + "");
            while (rs.next()) {

                rs.getInt("orderNumber");

                if (rs.getInt("orderNumber") == idpedido) {
                    System.out.println("idpedido");
                    existepedido = true;
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        if (existepedido && existeproducto) {

            try {

                String sql = "INSERT INTO 'orderdetails' ('orderNumber','productCode','priceEach','orderLineNumber','quantityOrdered)\n"
                        + "VALUES (?,?,?,?,?);";
                PreparedStatement prepstatement = con.prepareStatement(sql);
                prepstatement.setQueryTimeout(30);

                prepstatement.setInt(1, idpedido);
                prepstatement.setString(2, idproducto);
                prepstatement.setDouble(3, priceeach);
                prepstatement.setInt(4, ordlnb);
                prepstatement.setInt(5, qord);

                prepstatement.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("ERROR: ALGUNO DE LOS CAMPOS NO EXISTE");
        }
    }


}

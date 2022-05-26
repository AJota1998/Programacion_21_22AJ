package U8U9EXAMENTARDE_AJ.EJ3;

import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {
    Scanner teclado = new Scanner(System.in);
    Connection con = ConBD.getConnection();

    List<Employee> ListaEmployee = new ArrayList<>();

    public List<Employee> mostrarEmpleados() {
        System.out.println("Introduzca el codigo de oficina");
        String codigooficina = teclado.next();

        try {
            String sql = "SELECT * FROM employees WHERE officeCode = ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setString(1, codigooficina);

            ResultSet rs = prepstatement.executeQuery();

            while (rs.next()) {
                Employee e = new Employee(
                        rs.getInt("employeeNumber"),
                        rs.getString("lastName"),
                        rs.getString("firstName"),
                        rs.getString("extension"),
                        rs.getString("email"),
                        rs.getString("officeCode"),
                        rs.getInt("reportsTo"),
                        rs.getString("jobTitle")
                );
                ListaEmployee.add(e);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaEmployee;
    }

    public void convertToJSON() {
        Gson gson = new Gson();
        String json = gson.toJson(ListaEmployee);
        System.out.println(json);
    }
}

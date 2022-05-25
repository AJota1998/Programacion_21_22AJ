package EX_EJEMPLO.EJ3;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    Connection con = ConexBD.getConnection();

    List<Office> ListaOficce = new ArrayList<>();

    public List<Office> getOffices() {

        try {
            String sql = "SELECT * FROM offices";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            ResultSet rs = prepstatement.executeQuery();

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

    public void convertToJSON() {
        Gson gson = new Gson();
        String json = gson.toJson(ListaOficce);
        System.out.println(json);

//        try {
//            BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/jso_ejemplo.json"));
//            out.write(json);
//            out.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}

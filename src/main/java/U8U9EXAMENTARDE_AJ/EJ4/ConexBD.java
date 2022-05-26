package U8U9EXAMENTARDE_AJ.EJ4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexBD {
    private static Connection con=null;
    public static Connection getConnection(){
        try{
            if( con == null ){
                String driver="com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost:8093/classicmodels?autoReconnect=true";
                String pwd="programacion";
                String usr="programacion";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conection Succesfull");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
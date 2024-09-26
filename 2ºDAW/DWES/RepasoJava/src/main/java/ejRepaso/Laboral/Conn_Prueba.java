package ejRepaso.Laboral;

import java.sql.*;

public class Conn_Prueba {
    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados",
                    "root", "123456");
            Statement miStatement = miConexion.createStatement();
            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM empleado");
            while (miResultset.next()) {
                System.out.println(miResultset.getString("DNI") + ", "
                        + miResultset.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package e01;

import java.sql.*;

public class Consulta {
    public static void main(String[] args) {
        final String SQL = "SELECT * FROM regions";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.println("region_id = " + rs.getLong(1) + " region_name = " + rs.getString(2));
            }

        } catch (SQLException e) {
            System.out.println("Ocurrio un error al conectar o usar la base de datos");
            System.out.println(e);
        }
    }
}

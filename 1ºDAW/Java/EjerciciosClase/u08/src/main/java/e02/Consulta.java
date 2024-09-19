package e02;

import e01.DBUtils;
import java.sql.*;

public class Consulta {
    public static void main(String[] args) {
        final String SQL = "SELECT * FROM COUNTRIES";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println("country_id = " + rs.getString(1) + " // country_name = " + rs.getString(2)
                        + " // region_id = " + rs.getLong(3));
            }
        } catch (SQLException e) {
            System.out.println("Ocurrio un problema al conectar o usar la base de datos");
            System.out.println(e);
        }
    }

}

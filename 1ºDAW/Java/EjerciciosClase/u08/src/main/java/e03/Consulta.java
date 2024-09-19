package e03;

import e01.DBUtils;
import java.sql.*;

public class Consulta {
    public static void main(String[] args) {
        final String SQL = "SELECT REGION_NAME, COUNTRY_NAME" +
                " FROM REGIONS R JOIN COUNTRIES C ON R.REGION_ID = C.REGION_ID ORDER BY REGION_NAME";

        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println("region_name = " + rs.getString(2) + " || country_name = " + rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error al conectar o usar la base de datos");
            System.out.println(e);
        }
    }
}

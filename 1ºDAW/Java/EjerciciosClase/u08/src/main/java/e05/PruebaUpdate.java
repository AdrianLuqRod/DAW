package e05;

import e01.DBUtils;
import java.sql.*;

public class PruebaUpdate {
    public static void main(String[] args) {
        final String SQL = "UPDATE INVENTORIES SET QUANTITY = QUANTITY+10 WHERE "
                + "WAREHOUSE_ID = 7 AND PRODUCT_ID IN(SELECT PRODUCT_ID FROM PRODUCTS WHERE CATEGORY_ID = 1)";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();) {
            int numFilas = st.executeUpdate(SQL);
            System.out.println("Se han actualizado " + numFilas + " filas");
        } catch (SQLException e) {
            System.out.println("Se ha producido un error al conectar o usar la base de datos");
            System.out.println(e);
        }
    }
}

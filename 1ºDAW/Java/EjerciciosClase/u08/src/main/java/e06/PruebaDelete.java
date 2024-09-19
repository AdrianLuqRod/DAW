package e06;

import e01.DBUtils;
import java.sql.*;

public class PruebaDelete {
    public static void main(String[] args) {
        final String SQL = "DELETE FROM INVENTORIES WHERE WAREHOUSE_ID = 7 AND "
                + "PRODUCT_ID IN (SELECT P.PRODUCT_ID FROM PRODUCTS P JOIN PRODUCT_CATEGORIES PC ON "
                + "P.CATEGORY_ID = PC.CATEGORY_ID WHERE CATEGORY_NAME = 'CPU')";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();) {
            int numFilas = st.executeUpdate(SQL);
            System.out.println("Se han borrado " + numFilas + " filas");
        } catch (SQLException e) {
            System.out.println("Se ha producido un error al conectar o usar la base de datos.");
            System.out.println(e);
        }
    }
}

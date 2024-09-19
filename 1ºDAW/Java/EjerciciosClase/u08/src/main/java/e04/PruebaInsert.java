package e04;

import e01.DBUtils;
import java.sql.*;

public class PruebaInsert {
    public static void main(String[] args) {
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();) {
            int numFilas = st
                    .executeUpdate("INSERT INTO INVENTORIES (PRODUC_ID, WAREHOUSE_ID, QUANTITY) VALUES(7,7,10)");
            System.out.println("Se han insertado " + numFilas + " filas");

            numFilas = st
                    .executeUpdate("INSERT INTO INVENTORIES (PRODUC_ID, WAREHOUSE_ID, QUANTITY) VALUES(8,7,10)");
            System.out.println("Se han insertado " + numFilas + " filas");

            numFilas = st
                    .executeUpdate("INSERT INTO INVENTORIES (PRODUC_ID, WAREHOUSE_ID, QUANTITY) VALUES(9,7,10)");
            System.out.println("Se han insertado " + numFilas + " filas");
        } catch (SQLException e) {
            System.out.println("Se ha producido un error al conectar o usar la base de datos");
            System.out.println(e);
        }
    }
}

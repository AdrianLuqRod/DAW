package nominas.crud.App;

import nominas.crud.dao.EmpleadoDaoImpl;
import nominas.crud.model.Empleado;
import nominas.crud.pool.MyDataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        testDao();
    }

    public static void testPool() {
        try(Connection conn = MyDataSource.getConnection();) {
            DatabaseMetaData dbmd = conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, "%", types);
            while(rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void testDao() {
        EmpleadoDaoImpl dao = EmpleadoDaoImpl.getInstance();
        Empleado empl = new Empleado('H', "12345678A", "Pepe", 1, 1);
        System.out.println(empl.getDni());
        try {
            int n = dao.add(empl);
            System.out.println("El numero de registros insertados es: " + n);
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
package nominas.crud.App;

import nominas.crud.dao.EmpleadoDaoImpl;
import nominas.crud.model.Empleado;
import nominas.crud.pool.MyDataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
        Empleado empl = new Empleado('H', "12345678Z", "Adrian", 1, 1);
        Empleado empl2 = new Empleado('M', "87654321Z", "Mar", 1, 1);
        System.out.println(empl.getDni());
        try {
            int n = dao.add(empl);
            int n2 = dao.add(empl2);
            System.out.println("El numero de registros insertados es: " + (n + n2));
            List<Empleado> empleados = dao.getAll();
            if(empleados.isEmpty()) {
                System.out.println("No hay empleados");
            }
            for(Empleado e : empleados) {
                System.out.println(e);
            }
            Empleado e = dao.getByDni("87654321Z");
            System.out.println("Empleado encontrado correctamente:");
            System.out.println(e);
            dao.delete("87654321Z");
            empleados = dao.getAll();
            System.out.println("\n"+empleados);


        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
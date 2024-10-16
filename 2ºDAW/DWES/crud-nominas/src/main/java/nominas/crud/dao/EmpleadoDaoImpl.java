package nominas.crud.dao;

import nominas.crud.model.Empleado;
import nominas.crud.pool.MyDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmpleadoDaoImpl implements EmpleadoDao {

    private static EmpleadoDaoImpl instance;

    static {
        instance = new EmpleadoDaoImpl();
    }

    private EmpleadoDaoImpl() {
    }

    public static EmpleadoDaoImpl getInstance() {
        return instance;
    }

    public int add(Empleado empl) throws SQLException {
        String sql = "INSERT INTO empleado VALUES(?, ?, ?, ?, ?)";
        int result = 0;

        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.println(empl.getDni());
            pstmt.setString(1, empl.getDni());
            pstmt.setString(2, empl.getNombre());
            pstmt.setInt(3, empl.getCategoria());
            pstmt.setInt(4, empl.getAnyos());
            pstmt.setString(5, String.valueOf(empl.getSexo()));

            result = pstmt.executeUpdate();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public Empleado getByDni(String dni) throws SQLException {
        return null;
    }

    public List<Empleado> getAll() throws SQLException {
        return null;
    }

    public int update(Empleado empl) throws SQLException {
        return 0;
    }

    public void delete(String dni) throws SQLException {
    }

}
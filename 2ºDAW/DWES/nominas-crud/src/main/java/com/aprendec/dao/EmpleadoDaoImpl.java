package com.aprendec.dao;

import com.aprendec.model.Empleado;
import com.aprendec.pool.MyDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl implements EmpleadoDao {
    private final static EmpleadoDaoImpl instance;

    static {
        instance = new EmpleadoDaoImpl();
    }

    private EmpleadoDaoImpl() {
    }

    public static EmpleadoDaoImpl getInstance() {
        return instance;
    }

    /**
     * Method to add an Employee to the database
     *
     * @param empl
     * @return 1 if the employee was added, 0 otherwise
     * @throws SQLException
     */
    @Override
    public int add(Empleado empl) throws SQLException {
        String sql = "INSERT INTO empleado VALUES(?, ?, ?, ?, ?)";
        int result = 0;

        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
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

    /**
     * Method to get an Employee by its DNI
     *
     * @param dni
     * @return Employee object if found, null otherwise
     * @throws SQLException
     */
    @Override
    public Empleado getByDni(String dni) throws SQLException {
        Empleado empl = null;
        String sql = """
                SELECT * FROM empleado WHERE dni = ?;
                """;
        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);) {
            pst.setString(1, dni);
            try(ResultSet rs = pst.executeQuery();) {
                while(rs.next()) {
                    empl = doEmployee(rs);
                }
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return empl;
    }

    /**
     * Method to get all Employees from the database
     *
     * @return List of Employee objects
     * @throws SQLException
     */
    @Override
    public List<Empleado> getAll() throws SQLException {
        String sql = """
                SELECT * FROM empleado;
                """;
        List<Empleado> empleados = new ArrayList<>();
        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();) {
            Empleado empl;
            while(rs.next()) {
                empl = doEmployee(rs);
                empleados.add(empl);
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return empleados;
    }

    /**
     * Method to update an Employee in the database
     *
     * @param empl
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Empleado empl) throws SQLException {
        //! NO FUNCIONA BIEN, INTENTAR ARREGLAR CUANDO SE HAGA EL SERVLET CON LOS FORMS
        //! NO FUNCIONA BIEN, INTENTAR ARREGLAR CUANDO SE HAGA EL SERVLET CON LOS FORMS
        String sql = """
                UPDATE empleado SET dni = ?, nombre = ?, categoria = ?, anyos = ?, sexo = ?
                WHERE dni = ?;
                """;
        int result = 0;
        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, empl.getDni());
            pstmt.setString(2, empl.getNombre());
            pstmt.setInt(3, empl.getCategoria());
            pstmt.setInt(4, empl.getAnyos());
            pstmt.setString(5, String.valueOf(empl.getSexo()));
            pstmt.setString(6, empl.getDni());

            result = pstmt.executeUpdate();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Method to delete an Employee from the database
     *
     * @param dni
     * @throws SQLException
     */
    @Override
    public void delete(String dni) throws SQLException {
        String sql = """
                DELETE FROM empleado where dni = ?;
                """;
        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, dni);
            pstmt.executeUpdate();

        } catch(SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Method to create an Employee object from a ResultSet
     *
     * @param rs
     * @return Employee object
     * @throws SQLException
     */
    private Empleado doEmployee(ResultSet rs) throws SQLException {
        return new Empleado(rs.getString("sexo").charAt(0),
                rs.getString("dni"), rs.getString("nombre"),
                rs.getInt("categoria"), rs.getInt("anyos"));
    }
}
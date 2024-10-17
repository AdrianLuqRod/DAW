package crud.nominas.dao;

import crud.nominas.model.Employee;
import crud.nominas.pool.MyDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private final static EmployeeDaoImpl instance;

    static {
        instance = new EmployeeDaoImpl();
    }

    private EmployeeDaoImpl() {
    }

    public static EmployeeDaoImpl getInstance() {
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
    public int add(Employee empl) throws SQLException {
        String sql = "INSERT INTO empleado VALUES(?, ?, ?, ?, ?)";
        int result = 0;

        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, empl.getDni());
            pstmt.setString(2, empl.getName());
            pstmt.setInt(3, empl.getCategory());
            pstmt.setInt(4, empl.getWorkYears());
            pstmt.setString(5, String.valueOf(empl.getGender()));

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
    public Employee getByDni(String dni) throws SQLException {
        Employee empl = null;
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
    public List<Employee> getAll() throws SQLException {
        String sql = """
                SELECT * FROM empleado;
                """;
        List<Employee> empleados = new ArrayList<>();
        try(Connection conn = MyDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();) {
            Employee empl;
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
    public int update(Employee empl) throws SQLException {
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
            pstmt.setString(2, empl.getName());
            pstmt.setInt(3, empl.getCategory());
            pstmt.setInt(4, empl.getWorkYears());
            pstmt.setString(5, String.valueOf(empl.getGender()));
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
    private Employee doEmployee(ResultSet rs) throws SQLException {
        return new Employee(rs.getString("Sexo").charAt(0),
                rs.getString("DNI"), rs.getString("Nombre"),
                rs.getInt("Categoria"), rs.getInt("Anyos"));
    }
}
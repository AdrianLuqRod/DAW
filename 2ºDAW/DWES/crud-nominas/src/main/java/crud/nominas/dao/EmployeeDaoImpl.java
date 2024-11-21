package crud.nominas.dao;

import crud.nominas.model.Employee;
import crud.nominas.pool.MyDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl extends FactoryDAO implements EmployeeDao  {
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
     *
     * @return 1 if the employee was added, 0 otherwise
     *
     * @throws SQLException
     */
    @Override
    public int add(Employee empl) throws SQLException {
        String sql = "INSERT INTO empleado VALUES(?, ?, ?, ?, ?)";
        int result = 0;

        try (Connection conn = MyDataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, empl.getDni());
            pstmt.setString(2, empl.getName());
            pstmt.setInt(3, empl.getCategory());
            pstmt.setInt(4, empl.getWorkYears());
            pstmt.setString(5, String.valueOf(empl.getGender()));

            result = pstmt.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Method to get an Employee by its DNI
     *
     * @param dni
     *
     * @return Employee object if found, null otherwise
     *
     * @throws SQLException
     */
    @Override
    public Employee getByDni(String dni) throws SQLException {
        Employee empl = null;
        String sql = """
                SELECT * FROM empleado WHERE dni = ?;
                """;
        try (Connection conn = MyDataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);) {
            pst.setString(1, dni);
            try (ResultSet rs = pst.executeQuery();) {
                while (rs.next()) {
                    empl = doEmployee(rs);
                }
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empl;
    }

    /**
     * Method to get all Employees from the database
     *
     * @return List of Employee objects
     *
     * @throws SQLException
     */
    @Override
    public List<Employee> getAll() throws SQLException {
        String sql = """
                SELECT * FROM empleado;
                """;
        List<Employee> empleados = new ArrayList<>();
        try (Connection conn = MyDataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery();) {
            Employee empl;
            while (rs.next()) {
                empl = doEmployee(rs);
                empleados.add(empl);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empleados;
    }

    /**
     * Method to update an Employee in the database
     *
     * @param empl
     *
     * @return
     *
     * @throws SQLException
     */
    @Override
    public int update(Employee empl) throws SQLException {
        String sql = """
                UPDATE empleado SET nombre = ?, categoria = ?, anyos = ?, sexo = ? WHERE dni = ?;
                """;
        int result = 0;
        try (Connection conn = MyDataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, empl.getName());
            pstmt.setInt(2, empl.getCategory());
            pstmt.setInt(3, empl.getWorkYears());
            pstmt.setString(4, String.valueOf(empl.getGender()));
            pstmt.setString(5, empl.getDni());
            result = pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Method to delete an Employee from the database
     *
     * @param dni
     *
     * @throws SQLException
     */
    @Override
    public void delete(String dni) throws SQLException {
        String sql = """
                DELETE FROM empleado where dni = ?;
                """;
        try (Connection conn = MyDataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, dni);
            pstmt.executeUpdate();

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Method to get an Employee by any field.
     * @param empl
     * @return List of Employee objects that match the search criteria.
     * @throws SQLException
     */
    public List<Employee> getByAnything(Employee empl) throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM empleado WHERE 1=1");
        List<Object> params = new ArrayList<>();

        if (empl.getDni() != null && !empl.getDni().isEmpty()) {
            sql.append(" AND dni = ?");
            params.add(empl.getDni());
        }
        if (empl.getName() != null && !empl.getName().isEmpty()) {
            sql.append(" AND nombre = ?");
            params.add(empl.getName());
        }
        if (empl.getCategory() != 0) {
            sql.append(" AND categoria = ?");
            params.add(empl.getCategory());
        }
        if (empl.getWorkYears() != 0) {
            sql.append(" AND anyos = ?");
            params.add(empl.getWorkYears());
        }
        if (empl.getGender() != null && !empl.getGender().isEmpty()) {
            sql.append(" AND sexo = ?");
            params.add(String.valueOf(empl.getGender()));
        }
        try (Connection conn = MyDataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {
            for (int i = 0; i < params.size(); i++) {
                pstmt.setObject(i + 1, params.get(i));
            }
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    employeeList.add(doEmployee(rs));
                }
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employeeList;
    }

    /**
     * Method to create an Employee object from a ResultSet
     *
     * @param rs
     *
     * @return Employee object
     *
     * @throws SQLException
     */
    private Employee doEmployee(ResultSet rs) throws SQLException {
        return new Employee(rs.getString("Sexo"),
                rs.getString("DNI"), rs.getString("Nombre"),
                rs.getInt("Categoria"), rs.getInt("Anyos"));
    }

}
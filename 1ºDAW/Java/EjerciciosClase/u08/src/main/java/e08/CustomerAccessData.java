package e08;

import e01.DBUtils;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerAccessData {

    public Customer selectById(int customerId) throws CustomerAccessDataException {
        final String SQL = "SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID = " + customerId;

        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {

            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String website = rs.getString("website");
                double creditLimit = rs.getDouble("credit_limit");
                return new Customer(id, name, address, website, creditLimit);
            }
        } catch (SQLException e) {
            System.out.println("Se ha producido un error al conectar o usar la base de datos");
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
        return null;
    }

    public List<Customer> selectAll() throws CustomerAccessDataException {
        List<Customer> lista = new ArrayList<>();
        final String SQL = "SELECT * FROM CUSTOMERS";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String website = rs.getString("website");
                double creditLimit = rs.getDouble("credit_limit");
                lista.add(new Customer(id, name, address, website, creditLimit));
            }
            return lista;

        } catch (SQLException e) {
            System.out.println("Se ha producido un error al conectar o usar la base de datos");
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
    }

    public List<Customer> selectByName(String customerName) throws CustomerAccessDataException {
        List<Customer> lista = new ArrayList<>();
        final String SQL = "SELECT * FROM CUSTOMERS WHERE NAME = '" + customerName + "'";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String website = rs.getString("website");
                double creditLimit = rs.getDouble("credit_limit");
                lista.add(new Customer(id, name, address, website, creditLimit));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
    }

    public boolean update(Customer c) throws CustomerAccessDataException {
        final String SQL = "UPDATE CUSTOMERS SET NAME = " + toStringSQL(c.getName()) + ", ADDRESS = "
                + toStringSQL(c.getAddress()) + ", WEBSITE = " + toStringSQL(c.getWebsite()) + ", CREDIT_LIMIT = "
                + c.getCreditLimit() + " WHERE CUSTOMER_ID = "
                + c.getCustomerId();
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();) {
            int numFilas = st.executeUpdate(SQL);
            System.out.println("Se han actualizado " + numFilas + " filas ");
            return numFilas != 0;
        } catch (SQLException e) {
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
    }

    public boolean delete(Customer c) throws CustomerAccessDataException {
        final String SQL = "DELETE FROM CUSTOMERS WHERE CUSTOMER_ID = " + c.getCustomerId();
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();) {
            int numFilas = st.executeUpdate(SQL);
            System.out.println("Se han borrado " + numFilas + " filas ");
            return numFilas != 0;
        } catch (SQLException e) {
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
    }

    private Customer selectNewestByName(String customerName) throws CustomerAccessDataException {
        final String SQL = "SELECT * FROM CUSTOMERS WHERE NAME = " + toStringSQL(customerName)
                + " ORDER BY CUSTOMER_ID DESC";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL)) {
            if (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
    }

    public Customer create(String name, String address, String website, double creditLimit)
            throws CustomerAccessDataException {
        final String SQL = "INSERT INTO CUSTOMERS(NAME,ADDRESS,WEBSITE,CREDIT_LIMIT) VALUES(" + (toStringSQL(name))
                + "," + toStringSQL(address) + ","
                + toStringSQL(website) + "," + creditLimit + ")";
        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();) {
            st.executeUpdate(SQL);
            return selectNewestByName(name);
        } catch (SQLException e) {
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }
    }

    public List<Customer> selectByCreditLimitRange(double minCreditLimit, double maxCreditLimit, boolean ordered)
            throws CustomerAccessDataException {
        List<Customer> lista = new ArrayList<>();
        String sql = "SELECT * FROM CUSTOMERS WHERE CREDIT_LIMIT BETWEEN " + minCreditLimit + " AND " + maxCreditLimit;
        // if (ordered) {
        // sql += " ORDER BY CREDIT_LIMIT";
        // }

        try (Connection conn = DBUtils.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql + (ordered ? "ORDER BY CREDIT_LIMIT" : ""))) {
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String website = rs.getString("website");
                double creditLimit = rs.getDouble("credit_limit");
                lista.add(new Customer(id, name, address, website, creditLimit));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e);
            throw new CustomerAccessDataException("Se produjo un error al acceder a los datos del cliente");
        }

    }

    public String toStringSQL(String texto) {
        return "'" + texto + "'";
    }

}

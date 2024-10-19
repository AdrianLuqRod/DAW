package crud.nominas.dao;

import crud.nominas.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {

    int add(Employee empl) throws SQLException;

    Employee getByDni(String dni) throws SQLException;

    List<Employee> getAll() throws SQLException;

    List<Employee> getByAnything(Employee empl) throws SQLException;

    int update(Employee empl) throws SQLException;

    void delete(String dni) throws SQLException;

}
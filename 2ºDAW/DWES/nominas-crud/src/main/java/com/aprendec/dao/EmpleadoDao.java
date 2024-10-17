package com.aprendec.dao;

import com.aprendec.model.Empleado;

import java.sql.SQLException;
import java.util.List;

public interface EmpleadoDao {
    int add(Empleado empl) throws SQLException;

    Empleado getByDni(String dni) throws SQLException;

    List<Empleado> getAll() throws SQLException;

    int update(Empleado empl) throws SQLException;

    void delete(String dni) throws SQLException;

}
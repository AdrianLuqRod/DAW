package nominas.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import nominas.crud.conexion.Conexion;
import nominas.crud.model.Empleado;

public class EmpleadoDAO {
    private Connection connection;
    private PreparedStatement statement;
    private boolean estadoOperacion;


    private Connection obtenerConexion() throws SQLException {
        return Conexion.getConnection();
    }

    public List<Empleado> obtenerEmpleados() throws SQLException {
        ResultSet resultSet = null;
        List<Empleado> listaEmpleados = new ArrayList<>();

        String sql = null;
        estadoOperacion = false;
        connection = obtenerConexion();
        try {
            sql = "SELECT * FROM empleado";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                Empleado empleado = new Empleado();
                empleado.setDni(resultSet.getString(1));
                empleado.setNombre(resultSet.getString(2));
                empleado.setCategoria(resultSet.getInt(3));
                empleado.setAnyos(resultSet.getInt(4));
                empleado.setSexo(resultSet.getString(5).charAt(0));
                listaEmpleados.add(empleado);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }
}
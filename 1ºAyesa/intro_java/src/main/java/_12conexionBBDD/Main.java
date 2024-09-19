package _12conexionBBDD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        createNewDatabase("test.db");
        connect();
        insert("Raw Materials", 3000);

    }

    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:intro_java/src/main/java/_12conexionBBDD/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("El nombre del driver es " + meta.getDriverName());
                System.out.println("Se ha creado una nueva base de datos.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    private static Connection connect() {
        String url = "jdbc:sqlite:intro_java/src/main/java/_12conexionBBDD/test.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión a SQLite establecida.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void insert(String name, double capacity) {
        String sql = "INSERT INTO warehouses(name,capacity) VALUES(?,?)";
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

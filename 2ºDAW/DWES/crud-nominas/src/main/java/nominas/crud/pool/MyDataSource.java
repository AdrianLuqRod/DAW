package nominas.crud.pool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;


public class MyDataSource {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource dataSource;

    static{
        config.setJdbcUrl("jdbc:mysql://localhost:3306/empleados?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&serverTimezone=Europe/Madrid");
        config.setUsername("root");
        config.setPassword("123456");
        config.addDataSourceProperty("maximumPoolSize","1");
        config.addDataSourceProperty("cachePrepStmts","true");
        config.addDataSourceProperty("prepStmtCacheSize","250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit","2048");
        dataSource = new HikariDataSource(config);
    }

    private MyDataSource(){}

    public static Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }
}
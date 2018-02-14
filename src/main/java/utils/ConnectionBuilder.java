package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBuilder {

    private static Connection connection;
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String dbUsername;
    private String dbPassword;

    public ConnectionBuilder(String dbHost, String dbPort, String dbName, String dbUsername, String dbPassword) {
        this.dbHost = dbHost;
        this.dbPort = dbPort;
        this.dbName = dbName;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public static void setDatabase(ConnectionBuilder builder) {
        try {
            String dbDriverLocalHost = "org.apache.derby.jdbc.ClientDriver";
            String connectionLocalHost = "jdbc:derby://";
            if (builder.dbHost.equalsIgnoreCase("localhost")) {
                connectionLocalHost += builder.dbHost
                        + ":"
                        + builder.dbPort
                        + "/"
                        + builder.dbName;
                Class.forName(dbDriverLocalHost);
                connection = DriverManager.getConnection(connectionLocalHost,"root","password");

            } else {
                String dbDriver = "com.mysql.jdbc.Driver";
                String connectionString = "jdbc:mysql://";
                connectionString += builder.dbHost
                        + ":"
                        + builder.dbPort
                        + "/"
                        + builder.dbName
                        + "?"
                        + "useUnicode=true&characterEncoding=UTF-8"; //for reading Thai

                Class.forName(dbDriver);
                connection = DriverManager.getConnection(connectionString, builder.dbUsername, builder.dbPassword);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() throws ClassNotFoundException {
        return connection;
    }
}

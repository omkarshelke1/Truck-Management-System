package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {
    //public static String Load_Driver= "com.mysql.cj.jdbc.Driver";
    public static String Username = "root";
    public static String Password = "OmkarShelke#1312";
    public static String URL = "jdbc:mysql://localhost:3306/TruckMgt";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,Username,Password);
    }
}

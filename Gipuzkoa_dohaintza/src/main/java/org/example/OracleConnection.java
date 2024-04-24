package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
    public static void konektatu() {
        String url = "jdbc:oracle:thin:@10.14.4.121:1521:ORCLCDB";
        String user = "janire";
        String password = "zubiri";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Konexioa egoki egin da!");
            } else {
                System.out.println("Konexioa egiterakoan errore bat egon da.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

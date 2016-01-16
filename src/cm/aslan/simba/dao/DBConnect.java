/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author kraulain
 */
public class DBConnect {
    static Connection conn = null;
    static String url = "jdbc:mysql://localhost:3306/chariotdb";
    static String log = "root";
    static String pass = "toor";

    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, log, pass);
            System.out.println("connetction succesful");
        } catch (ClassNotFoundException | SQLException e) {
            //System.out.println(e);
        }
        return conn;
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
            System.out.println("Connettion closed");
        } catch (SQLException sqle) {
            //System.out.println(sqle);
        }
    }
}

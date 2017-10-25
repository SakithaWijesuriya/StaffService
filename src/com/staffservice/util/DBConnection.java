/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.staffservice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sakitha Nawodana
 */
public class DBConnection {

    void getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String dbURL = "jdbc:mysql://localhost/staff_service";
        String user = "root";
        String pass = "root";
        Connection conn = DriverManager.getConnection(dbURL, user, pass);
        try {
            if (conn != null) {
                System.out.println("Connected");

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from staff_service.staff");
                while (rs.next()) {
                    System.out.println(rs.getString("id"));
                }
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new DBConnection().getConnection();
    }
}

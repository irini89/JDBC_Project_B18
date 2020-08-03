package com.cybertek.day1;

import java.sql.*;

public class Iterating_country_tables {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.90.25.217:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from countries");

        while(rs.next() == true){
            System.out.println(rs.getString(1) + " " +rs.getString(2) + " " +rs.getString(3));
        }


    }
}
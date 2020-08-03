package com.cybertek.day1;

import java.sql.*;

public class IteratingResultSet {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.90.25.217:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");

        //as long as rs.next return true
        //we will keep looping as long as rs.next() return true

        while (rs.next() == true) {

            System.out.println(rs.getString("region_id") + " " +rs.getString("region_name"));
        }

        //task 1
        //create a new class , add connection, statement resultset
        //and try to print out each and everything under countries table



    }

}
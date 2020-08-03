package com.cybertek.day1;

import java.sql.*;

public class movingForwardAndBackwarsWithResult {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.90.25.217:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
       // Statement stmnt = conn.createStatement();
        //this will make the resultset created from this statement able to move forward and backward
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmnt.executeQuery("select * from countries");
        rs.next();
        System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        rs.next();
        System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        rs.previous();
        System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        //moving the cursor freely between row
     //   rs.previous();
      //  System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        //moving to the last row directly
        rs.last(); //this will move the cursor to the last location
        System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        rs.first();
        System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        rs.absolute(5); // this will move the cursor directly to the 5th row
        System.out.println(rs.getString("country_id") + " " +rs.getString("country_name") );

        // how to move to before first row location
        rs.beforeFirst();

        // how to move to after last row location
        rs.afterLast();
    }
}
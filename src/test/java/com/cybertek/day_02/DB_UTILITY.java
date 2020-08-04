package com.cybertek.day_02;

import java.sql.*;

public class DB_UTILITY {
    //adding static field so we can access in all static methods
  private static Connection conn;
  private static ResultSet rs ;

    // a method to create connection
    //with valid url and username
    public static void createConnection() {
        String connectionStr = "jdbc:oracle:thin:@54.90.25.217:1521:XE";
        String username = "hr";
        String password = "hr";


        try {
            conn = DriverManager.getConnection(connectionStr,username,password) ;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //a method to get the resultset object
        //with valid connection by executing query
    }
    public static ResultSet runQuery(String query) {
        ResultSet rs = null ;
        try {
            Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmnt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  rs ;
    }
}

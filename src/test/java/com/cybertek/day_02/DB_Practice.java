package com.cybertek.day_02;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DB_Practice {
    public static void main(String[] args) throws SQLException {

    // print out all data from jobs table

        DB_UTILITY.createConnection();
        ResultSet rs = DB_UTILITY.runQuery("SELECT * FROM JOBS");

        // ITERATE OVER THE RESULTSET
        rs.next();
        // get first 2 column
        System.out.println(rs.getString(1));

        while(rs.next()){
            System.out.println(rs.getString(1));
        }

        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        System.out.println("colCount = " + DB_UTILITY.getColumnCNT());
        //what if we want to print out evrrything in the result set
        // without knowing the column name



}
}
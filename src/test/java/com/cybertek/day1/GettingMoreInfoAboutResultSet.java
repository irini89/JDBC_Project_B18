package com.cybertek.day1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GettingMoreInfoAboutResultSet {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.90.25.217:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM EMPLOYEES");

        // resultSet MetaData is data about the resultSet like column count, column name
        ResultSetMetaData rsmd = rs.getMetaData();

        //counting how many columns we have in our resultSet object
       int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        //find out column name according to the index
        String secondColumnName= rsmd.getColumnName(2);
        System.out.println("secondColumnName = " + secondColumnName);

        //how to list all the column names from the resultSet
        // you know how many column we have using getColumnCountName method
        // you know how to get column name from index getColumnCountName method

        for(int i =1; i <= columnCount; i++){
           // System.out.println(rsmd.getColumnName(i));
            System.out.println("Number " + i + " Column name is: " + rsmd.getColumnName(i));
        }

        // store the column names in the list
        List<String> columnNameLst = new ArrayList<>();
        for (int i = 1; i <= columnCount ; i++) {
            columnNameLst.add(rsmd.getColumnName(2));
            System.out.println("columnNameList = " +columnNameLst);



        }

        // getting column count we need resultSetMetaData object
        //getting row count
        //we will use rs.last() to move to last row then call rs.getRow() method
          // that will be the row count of the entire resultSet

        // ----------cleaning up------
        rs.close();
        stmnt.close();
        conn.close();

    }
}
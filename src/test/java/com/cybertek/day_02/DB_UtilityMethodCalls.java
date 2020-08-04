package com.cybertek.day_02;

public class DB_UtilityMethodCalls {
    public static void main(String[] args) {

        DB_Utility.createConnection();
        DB_Utility.runQuery("SELECT * FROM JOBS");

        DB_Utility.displayAllData();

        System.out.println("column count is " +DB_Utility.getColumnCNT());

        System.out.println("row  count is " +DB_Utility.getRowCount());

        System.out.println(" getting 3rd row of jobs table" +DB_Utility.getRowDataAsList(3));

    }
}

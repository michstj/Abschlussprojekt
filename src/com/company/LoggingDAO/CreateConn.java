package com.company.LoggingDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConn {

    static Connection conn = null;

    public CreateConn(){

    }

    public static Connection getConn(){
        try {
            if(conn == null){
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abschluss" , "root", "");
            }
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return conn;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Raj Cassette
 */
public class myConnection {
   public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/prms";
        String uname="root";
        String pwd="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pwd);
            return con;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}

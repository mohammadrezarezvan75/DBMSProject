/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezvan.Dataaccess.Student;

import rezvan.Dataaccess.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import rezvan.entity.member;


/**
 *
 * @author MRZR
 */
public class DbStudent {
    private Connection conn;
     
        public Connection getConnection() throws Exception{
            
        String dbURL1="jdbc:derby://localhost:1527/FirstDataBase";
        String user="sa";
        String password="123";
        
         conn = DriverManager.getConnection(dbURL1, user, password);
    
            return conn ;
        }
        
        public void executeUpdateQuery(String query) throws Exception{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        }
        
          public ResultSet executeQuery(String query) throws Exception{
            Statement stmt = conn.createStatement();
            ResultSet result=stmt.executeQuery(query);
            return result;
        }
        
        
     
       public void closeconnection() throws Exception{
            conn.close();
        }
        
    
}



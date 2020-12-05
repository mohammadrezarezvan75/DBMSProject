
package DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectDBMS {
    public static void main(String[] args) throws Exception {
        
        String dbURL1="jdbc:derby://localhost:1527/FirstDataBase";
        String user="sa";
        String password="123";
        
        Connection conn = DriverManager.getConnection(dbURL1, user, password);
        
        String Select="SELECT * FROM student";
        
       Statement stmt = conn.createStatement();
      
       
       
        ResultSet rs = stmt.executeQuery(Select);
        while (rs.next()) {
            System.out.println("id :" + rs.getInt("id") +
                               " name: " + rs.getString("name") + 
                               " lastname: " + rs.getString("lastname") + 
                               " Address: " + rs.getString("Address") + 
                               " Age :  " + rs.getInt("Age")+
                               " Passed Units :  " + rs.getInt("Passed Units")+
                               " UnPassed Units :  " + rs.getInt("UnPassed Units"));
                               

            }
          
          System.out.println("\n");
       
        System.out.println("Finish Select sucess");
  
        
    }
}

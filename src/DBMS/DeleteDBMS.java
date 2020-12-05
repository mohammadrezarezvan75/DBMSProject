
package DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DeleteDBMS {
    public static void main(String[] args) throws Exception {
        
        String dbURL1="jdbc:derby://localhost:1527/FirstDataBase";
        String user="sa";
        String password="123";
        
        Connection conn = DriverManager.getConnection(dbURL1, user, password);
        
       
       String Delete=" DELETE FROM student where id=9 and \"name\"='Mohammadreza'";
        
       Statement stmt = conn.createStatement();
       stmt.executeUpdate(Delete);
       
        System.out.println("Finish Delete sucess");
        
    }
}

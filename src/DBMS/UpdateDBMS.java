
package DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdateDBMS {
    public static void main(String[] args) throws Exception {
        
        String dbURL1="jdbc:derby://localhost:1527/FirstDataBase";
        String user="sa";
        String password="123";
        
        Connection conn = DriverManager.getConnection(dbURL1, user, password);
        
        
        
        
        String update = " UPDATE student \n" +
                        "SET \"name\" = 'alireza' , \"age\" =21 ,\"address\" ='karaj'  \n"+
                        "where id=5";
                        
                        
                        
        
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(update);
        
        System.out.println("Update Sucsess");
        
    }
}

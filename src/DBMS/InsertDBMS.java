
package DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertDBMS {
    public static void main(String[] args) throws Exception {
        
        String dbURL1="jdbc:derby://localhost:1527/FirstDataBase";
        String user="sa";
        String password="123";
        
        Connection conn = DriverManager.getConnection(dbURL1, user, password);
        
        String Insert="INSERT INTO student (\"name\", \"lastname\", \"Address\",\"Age\",\"Passed Units\",\"unPassed Units\")\n"+
                                             "VALUES ('MohammadReza', 'rezvan','sabashahr',23,12,2)";
        
       Statement stmt = conn.createStatement();
       stmt.executeUpdate(Insert);
       
        System.out.println("Finish insert sucess");
  
        
    }
}

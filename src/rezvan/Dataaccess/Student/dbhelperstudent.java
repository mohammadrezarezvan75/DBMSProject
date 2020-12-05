/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezvan.Dataaccess.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import rezvan.entity.Student.Student;


/**
 *
 * @author MRZR
 */
public class dbhelperstudent {
    
     private DbStudent dbStudent;
    
      public dbhelperstudent(){
          dbStudent=new DbStudent();
      }
  
    public void info(String name,String lastname,String Address,int age,int PassedUnits,int UnPassedUnits ) throws Exception{
        
       
        
        Connection conn=dbStudent.getConnection();
      
        
         String Query="INSERT INTO Student (\"name\", \"lastname\",\"Address\",\"age\",\"Passed Units\",\"UnPassed Units\")\n"+
                                             "VALUES ('"+name+"','"+lastname+"','"+Address+"'',"+age+"','"+PassedUnits+"','"+UnPassedUnits+"' )";
         
         
           dbStudent.executeUpdateQuery(Query);
      

    }

        public boolean cheakforDuplicateUserName(String name,String lastname,String Address,int Age,int PassedUnits,int UnPassedUnits) throws Exception {
            
          
             Connection conn=dbStudent.getConnection();
             
              String Studnetquery="'"+"SELECT * FROM student";
              
              
                ResultSet rs=dbStudent.executeQuery(Studnetquery);
                Student dbstudent=new Student();
                while (rs.next()) {
                break;
            }
                
         return false;
            
        
        }
}

   
    


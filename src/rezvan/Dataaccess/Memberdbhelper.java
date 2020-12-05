
package rezvan.Dataaccess;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import rezvan.entity.member;



public class Memberdbhelper {
    
    private DBHelper dbhelper;
    
      public Memberdbhelper(){
          dbhelper=new DBHelper();
      }
  
    public void register(String UserName,String Password) throws Exception{
        
       
        
        Connection conn=dbhelper.getConnection();
      
        
         String Query="INSERT INTO member (\"username\", \"password\")\n"+
                                             "VALUES ('"+UserName+"','"+Password+"' )";
         
         
           dbhelper.executeUpdateQuery(Query);
      

    }

        public boolean cheakforDuplicateUserName(String userName) throws Exception {
            
          
             Connection conn=dbhelper.getConnection();
             
              String query="SELECT * FROM member where \"username\"='"+ userName +"'";
              
              
             ResultSet rs=dbhelper.executeQuery(query);
                member Member=new member();
                while (rs.next()) {
                Member.setUserName(rs.getString("username"));
                break;
            }
            
            if(Member.getUserName()==null)
               return false;
             else
                return true;
            
        }
}
    


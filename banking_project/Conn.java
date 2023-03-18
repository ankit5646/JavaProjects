package banking_project;

import java.sql.*;

public class Conn {
   
   Connection c; 
   Statement s;
   public Conn(){
   try{
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagemnetsystem", "root", "Ankit@5646"); //localhost:3306 is default host no need to mention
        s = c.createStatement();
   } catch(Exception e){
    System.out.println(e);
   }

   }

}

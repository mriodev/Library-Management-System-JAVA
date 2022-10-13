/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithus.MyFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Malindu
 */
public class DBConnect {
      static Connection con;
    static void DBconnect(){
        
        try
        {   
        String host = "jdbc:mysql://localhost:3306/lms";    
        String usn = "root";
        String pwd = "";
        
        con = DriverManager.getConnection(host,usn,pwd);
        
           //JOptionPane.showMessageDialog(null, "Database Connection is Successfull");
        }
    catch(SQLException ex)
    {
    JOptionPane.showMessageDialog(null, ex.getMessage());
    }
        
    }
}

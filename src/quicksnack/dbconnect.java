/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksnack;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author wstar
 */
public class dbconnect {
    
   static Connection con;
   static Statement stmt;
   static ResultSet rs;
   
   String host = "jdbc:derby://localhost:1527/Base";
   String uname = "qwer";
   String upass = "1234";
     boolean logged;
   String g="tew"; 
       String a;      
            
    public dbconnect() {
        //initComponents();
        //SetConnectAdmin();
    }
    
    
    
    public void SetConnect() throws SQLException {
      //  con = DriverManager.getConnection(host, uname, upass);
    }
    
    public String SetConnectAdmin(String pass, String log) throws SQLException {
        //try {
            
           // g = "DOGED";
         con = DriverManager.getConnection(host, uname, upass);
            stmt =con.createStatement();
            
            String SQL = "SELECT * FROM USERS WHERE NAME='"+log+"' and PASS='"+pass+"'";
            System.out.println(SQL);
            rs = stmt.executeQuery(SQL);
            
            rs.next();
          //System.out.println(rs.getString("NAME"));
          
            String  name = rs.getString("NAME");
            String password = rs.getString("PASS");
//            rs.next();
            
            if (name.isEmpty()) a="no"; else a="yes";
           
                
            
            

            
//            jTextField1.setText(first_name);
//            jTextField2.setText(last_name);
       // } catch (SQLException err) {
            //JOptionPane.showMessageDialog(MainMe, err.getMessage());
//            jTextField1.setText("ERROR");
//String a ="1";
       // }
//      
//       return a;
       return a;
    }   //*/
//       String a ="1";
//       
//       return a; 
    }



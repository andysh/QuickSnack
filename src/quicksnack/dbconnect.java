/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksnack;
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
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public AdminForm() {
        initComponents();
        DoConnect();
    }
    public void DoConnect() {
        try {
            String host = "jdbc:derby://localhost:1527/Base";
            String uname = "qwer";
            String upass = "1234";
            con = DriverManager.getConnection(host, uname, upass);

            stmt = con.createStatement();
            String SQL = "SELECT * FROM USERS";
            rs = stmt.executeQuery(SQL);

            rs.next();
            String first_name = rs.getString("NAME");
            String last_name = rs.getString("PASS");

//            jTextField1.setText(first_name);
//            jTextField2.setText(last_name);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
//            jTextField1.setText("ERROR");
        }
    }
}


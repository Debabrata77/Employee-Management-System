
package EMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
   JTextField tfusername,tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(150,20 ,150,30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
         tfpassword = new JTextField();
        tfpassword.setBounds(150,70 ,150,30);
        add(tfpassword);
        
         JButton login = new JButton("Login");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.white);
        login.setForeground(Color.black);
        login.addActionListener(this);
        add(login);
        
        
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);        
    }
    public static void main(String[] args){
      new Login();  
    }
   

    @Override
    public void actionPerformed(ActionEvent ae) {
      try{
       String username = tfusername.getText();
       String password = tfpassword.getText();
       
       Connect c = new Connect();
       
       String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
       
    ResultSet  rs = c.s.executeQuery(query);
      if(rs.next()){
          setVisible(false);
      }else{
          JOptionPane.showMessageDialog(null, "Invalid username and password");
          setVisible(false);
      } 
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}

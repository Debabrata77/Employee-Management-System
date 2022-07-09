package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame {

    JButton view, add, update, remove;
    
    Home() {
       
       getContentPane().setBackground(Color.yellow);
        
        setLayout(null);
        
       
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add(add);
        
        view = new JButton("View Employees");
        view.setBounds(820, 80, 150, 40);
        add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(650, 140, 150, 40);
        add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
   
    

    public static void main(String[] args) {
        new Home();
    }
}
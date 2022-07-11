package EMS;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame{

    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;
    
    ViewEmployee() {
        
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        
        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        add(cemployeeId);
        
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while(rs.next()) {
                cemployeeId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        add(search);
        
        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        add(update);
        
        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new ViewEmployee();
    }
}

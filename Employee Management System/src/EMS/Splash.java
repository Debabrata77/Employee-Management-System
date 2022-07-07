
package EMS;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
   
    Splash(){
        
        getContentPane().setBackground(Color.GREEN);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JButton clickhere = new JButton("CLICK HERE TO START");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.white);
        clickhere.setForeground(Color.black);
        clickhere.addActionListener(this);
        add(clickhere);
        
        
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true); 
    }
   
    public static void main(String args[]) {
        new Splash();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    setVisible(false);
    new Login();
 
    }
}

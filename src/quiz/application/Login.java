package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(new Color(246, 253, 195));
        setLayout(null);
        
      
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/QuizLogo.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        //Heading "Quiz Time"
        JLabel heading = new JLabel("Quiz Time");
        heading.setBounds(800, 60, 300, 45);
        heading.setFont(new Font("Rosewood Std Regular", Font.BOLD, 35));
        heading.setForeground(new Color(44,120,101));
        add(heading);
        
        //Entering Name
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(44,120,101));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        add(tfname);
        
        //Next Button
        rules = new JButton("Next");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(44,120,101));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        //Exit Button
        back = new JButton("Exit");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(44,120,101));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        //Setting logo
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/QuizLogo.jpg"));
        setIconImage(logo.getImage()); //change icon of frame
        setTitle("OOP Lab Project"); //sets title of frame
        setResizable(false);
        setSize(1200, 500);
        setLocation(40, 100);//Open Location
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

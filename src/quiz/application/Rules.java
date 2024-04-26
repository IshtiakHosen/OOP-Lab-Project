package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(246, 253, 195));
        setLayout(null);
        
        
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/QuizLogo.jpg"));
        setIconImage(logo.getImage()); //change icon of frame
        setTitle("OOP Lab Project"); //sets title of frame
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Time Project !");
        heading.setBounds(100, 50, 700, 30);
        heading.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 28));
        heading.setForeground(new Color(44,120,101));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer so try to answer point to point." + "<br><br>" +
                "2. Do not waste time." + "<br><br>" +
                "3. Keep looking at the time line for each QN." + "<br><br>" +
                "4. Don't Desturb others with yout behavior." + "<br><br>" +
                "5. BE Calm!" + "<br><br>" +
                "6. Do not Look at others." + "<br><br>" +
                "7. Be confident with your answer" + "<br><br>" +
                "8. Have a good time with your exam, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        //Back Button
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(44,120,101));
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        //Start Button
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(44,120,101));
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(250, 10);
        setVisible(true);
        setResizable(false);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}

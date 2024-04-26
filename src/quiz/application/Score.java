package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(246, 253, 195));
        setLayout(null);
        
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/QuizLogo.jpg"));
        setIconImage(logo.getImage()); //change icon of frame
        setTitle("OOP Lab Project"); //sets title of frame
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " for Participating in QUIZ TIME");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 16));
        heading.setForeground(new Color(44,120,101));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 28));
        lblscore.setForeground(new Color(44,120,101));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(420, 270, 120, 30);
        submit.setBackground(new Color(44,120,101));
        submit.setForeground(Color.WHITE);
        heading.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}

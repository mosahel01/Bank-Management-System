package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    JLabel text1, text2, text3;

    Login () {

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        text1 = new JLabel("Welcome to the ATM");
        text1.setFont(new Font("agave nerd font", Font.BOLD, 38));
        text1.setBounds(200, 50, 400, 40);
        add(text1);

        text2 = new JLabel("Card No");
        text2.setFont(new Font("agave nerd font", Font.BOLD, 30));
        text2.setBounds(100, 150, 200, 40);
        add(text2);

        cardTextField = new JTextField();
        cardTextField.setBounds(250, 150, 350, 40);
        cardTextField.setFont(new Font("Iosevka", Font.BOLD, 25));
        add(cardTextField);

        text3 = new JLabel("PIN:");
        text3.setFont(new Font("agave nerd font", Font.BOLD, 30));
        text3.setBounds(100, 200, 400, 40);
        add(text3);

        // JTextField pinTextField = new JTextField();
        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("agave nerd font", Font.BOLD, 30));
        pinTextField.setBounds(250, 200, 350, 40);
        add(pinTextField);

        login = new JButton("Log in");
        login.setBounds(250, 300, 150, 40);
        login.setFont(new Font("Iosevka", Font.BOLD, 20));
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 150, 40);
        clear.setFont(new Font("Iosevka", Font.BOLD, 20));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(250, 370, 350, 40);
        signup.setFont(new Font("Iosevka", Font.BOLD, 20));
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setTitle("BANK MANAGEMENT SYSTEM");
        setSize(800, 480);
        setVisible(true);
        setLocation(1000, 340);
    }


    public static void main (String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
            System.out.println("Cleared Everything");
        } else if (e.getSource() == login) {
            System.out.println("Login");
        } else if (e.getSource() == signup) {
            System.out.println("Sign up");
        }
    }
}

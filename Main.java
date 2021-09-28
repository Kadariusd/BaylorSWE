
package com.company;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passLabel;
    private static JButton button;
    private static JTextField userText;
    private static JTextField passText;
    private static JLabel success;

    public static void main(String[] args) {


        JPanel panel = new JPanel();
        panel.setBackground(new Color(21, 71,52));
        JFrame frame = new JFrame();
        frame.setSize(325, 175);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // "User" Text
        userLabel = new JLabel("User" );
        userLabel.setBounds(10, 20, 80, 25);
        userLabel.setForeground(new Color(255, 184,28));
        panel.add(userLabel);

        // Username Input Box
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // "Password" Text
        passLabel = new JLabel("Password" );
        passLabel.setBounds(10, 60, 80, 25);
        passLabel.setForeground(new Color(255, 184,28));
        panel.add(passLabel);

        // Password Input Box
        passText = new JTextField();
        passText.setBounds(100, 60, 165, 25);
        panel.add(passText);


        // Login Button
        button = new JButton("Login");
        button.setBounds(100, 100, 75, 25);
        button.addActionListener(new Main());
        panel.add(button);

        // Message for Successful or Failed Attempt
        success = new JLabel("");
        success.setBounds(10,125,330, 25);
        success.setForeground(new Color(255, 184,28));
        panel.add(success);






        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();


        if(user.equals("Kadarius") && password.equals("Daniels")) {
            success.setText("Login successful!");

        }
        else {
            success.setText("Failed attempt");
        }
    }
}

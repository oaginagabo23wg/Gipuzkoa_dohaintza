package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginWindow() {
        setTitle("Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Sesioa hasi");

        setLayout(new GridLayout(3, 1));

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(new JLabel("Erabiltzailea: "));
        usernamePanel.add(usernameField);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel("Pasahitza: "));
        passwordPanel.add(passwordField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);

        add(usernamePanel);
        add(passwordPanel);
        add(buttonPanel);

        loginButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Ongi etorri " + username);
                new LehioNagusi().sortuLehioNagusi();
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erabiltzailea edo pasahitza ez da egokia.");
            }
        }
    }
}


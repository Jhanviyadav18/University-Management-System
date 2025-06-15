package university.management.system;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JTextField textFieldName;
    JPasswordField passwordField;
    JButton login, back;

    Login() {
        setTitle("Login");

        JLabel labelName = new JLabel("Username");
        labelName.setBounds(40, 20, 100, 20);
        add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(150, 20, 150, 20);
        add(textFieldName);

        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(40, 70, 100, 20);
        add(labelPass);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 20);
        add(passwordField);

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        back = new JButton("Back");
        back.setBounds(180, 140, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JLabel img = new JLabel(new ImageIcon(i2));
        img.setBounds(350, 20, 200, 200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/loginback.png"));
        Image i22 = i11.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i22));
        image.setBounds(0, 0, 600, 300);
        add(image);

        setSize(600, 300);
        setLocation(450, 250);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = textFieldName.getText();
            String password = new String(passwordField.getPassword()); // secure way to get password

            try {
                Conn c = new Conn();

                // Use PreparedStatement to prevent SQL injection
                String query = "SELECT * FROM login WHERE username = ? AND password = ?";
                PreparedStatement pst = c.connection.prepareStatement(query);
                pst.setString(1, username);
                pst.setString(2, password);

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    setVisible(false);
                    // TODO: Open next class here
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

                rs.close();
                pst.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == back) {
            setVisible(false);
            // Optional: navigate to the previous screen
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

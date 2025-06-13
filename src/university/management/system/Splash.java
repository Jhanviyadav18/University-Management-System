package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable { // Implements Runnable interface
    Thread t;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        setSize(900, 600); // Explicitly set window size
        setLocationRelativeTo(null); // Center the window
        setVisible(true);

        t = new Thread(this); // Correct way to create a thread
        t.start();
    }

    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            new Login(); // Assuming Login is another JFrame class
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}

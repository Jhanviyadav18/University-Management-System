package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Thread t;

    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
        Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        t = new Thread(String.valueOf(this));
        t.start();
        setVisible(true);

        setVisible(true);
    }
    public void run(){
        try {
            Thread.sleep(7000);
            setVisible(false);
            //next class

        }catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}

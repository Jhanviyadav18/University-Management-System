package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AddFaculty extends JFrame {

    JTextField textName,textfather;
    JLabel empText;

    Random ran = new Random();
    long f4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddFaculty(){

        getContentPane().setBackground(new Color(166,164,252));

        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("serif", Font.BOLD,20));
        add( name);

        textName = new JTextField();
        textName.setBounds(200,150,150,30);
        add(textName);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400,150,200,30);
        fname.setFont(new Font("serif", Font.BOLD,20));
        add( fname);

        textfather = new JTextField();
        textfather.setBounds(600,150,150,30);
        add(textfather);

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(50,200,200,30);
        empID.setFont(new Font("serif", Font.BOLD,20));
        add( empID);

        empText = new JLabel(""+f4);
        empText.setBounds(200,200,150,30);
        empText.setFont(new Font("serif", Font.BOLD,20));
        add( empText);

        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args){
        new AddFaculty();

    }
}

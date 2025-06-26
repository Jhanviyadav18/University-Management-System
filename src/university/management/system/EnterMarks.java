package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EnterMarks extends JFrame implements ActionListener {
    Choice choicerollno;
    JComboBox comboBox;
    JTextField sub1, sub2, sub3, sub4, sub5, mrk1, mrk2, mrk3, mrk4, mrk5;
    EnterMarks(){

        getContentPane().setBackground(new Color(252,245,210));
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/exam.png"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(500,40,400,300);
        add(img);

        JLabel heading = new JLabel("Enter Marks of the Student");
        heading.setBounds(50,0,500,50);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);

        JLabel rollno = new JLabel("Select Roll Number");
        rollno.setBounds(50,70,150,20);
//        rollno.setFont(new Font("Tahoma",Font.BOLD,20));
        add(rollno);

        choicerollno = new Choice();
        choicerollno.setBounds(200,70,150,20);
        add(choicerollno);

        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from student");
            while (resultSet.next()){
                choicerollno.add(resultSet.getString("rollno"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel sem = new JLabel("Select Semester");
        sem.setBounds(50,110,150,20);
        add(sem);

        String semester[] = {"1st Semester","2nd Semester","3rd Semester","4th Semester","5th Semester","6th Semester","7th Semester","8th Semester"};
        comboBox = new JComboBox(semester);
        comboBox.setBounds(200,110,150,20);
        comboBox.setBackground(Color.white);
        add(comboBox);

        JLabel entersub = new JLabel("Enter Subject");
        entersub.setBounds(100,150,200,40);
        add(entersub);

        JLabel entermarks = new JLabel("Enter Marks");
        entermarks.setBounds(320,150,200,40);
        add(entermarks);


        setSize(1000,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new EnterMarks();

    }
}

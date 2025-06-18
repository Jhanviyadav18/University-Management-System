package university.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AddFaculty extends JFrame {

    JTextField textName,textfather,textAddress,textPhone,textEmail,textM10,textM12,textAdhar;
    JLabel empText;
    JDateChooser cdob;
    JComboBox courseBox,DepartmentBox;
    JButton submit, cancel;

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

        empText = new JLabel("1234"+f4);
        empText.setBounds(200,200,150,30);
        empText.setFont(new Font("serif", Font.BOLD,20));
        add( empText);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(400,200,200,30);
        dob.setFont(new Font("serif", Font.BOLD,20));
        add(dob);

        cdob = new JDateChooser();
        cdob.setBounds(600,200,150,30);
        add(cdob);

        JLabel address = new JLabel("Address");
        address.setBounds(50,250,200,30);
        address.setFont(new Font("serif", Font.BOLD,20));
        add(address);

        textAddress = new JTextField();
        textAddress.setBounds(200,250,150,30);
        add(textAddress);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(400,250,200,30);
        phone.setFont(new Font("serif", Font.BOLD,20));
        add(phone);

        textPhone = new JTextField();
        textPhone.setBounds(600,250,150,30);
        add(textPhone);

        JLabel email = new JLabel("Email");
        email.setBounds(50,300,200,30);
        email.setFont(new Font("serif", Font.BOLD,20));
        add(email);

        textEmail = new JTextField();
        textEmail.setBounds(200,300,150,30);
        add(textEmail);

        JLabel M10 = new JLabel("Class X (%)");
        M10.setBounds(400,300,200,30);
        M10.setFont(new Font("serif", Font.BOLD,20));
        add(M10);

        textM10 = new JTextField();
        textM10.setBounds(600,300,150,30);
        add(textM10);

        JLabel M12 = new JLabel("Class XII (%)");
        M12.setBounds(50,350,200,30);
        M12.setFont(new Font("serif", Font.BOLD,20));
        add(M12);

        textM12 = new JTextField();
        textM12.setBounds(200,350,150,30);
        add(textM12);

        JLabel AdharNo = new JLabel("Adhar Number");
        AdharNo.setBounds(400,350,200,30);
        AdharNo.setFont(new Font("serif", Font.BOLD,20));
        add(AdharNo);

        textAdhar = new JTextField();
        textAdhar.setBounds(600,350,150,30);
        add(textAdhar);

        JLabel Qualification = new JLabel("Qualification");
        Qualification.setBounds(50,400,200,30);
        Qualification.setFont(new Font("serif", Font.BOLD,20));
        add(Qualification);

        String course[] = {"BCA","B.Tech","BBA","BSc","MSc","MBA","MCA","MCom","MA","BA"};
        courseBox = new JComboBox(course);
        courseBox.setBounds(200,400,150,30);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);

        JLabel Department = new JLabel("Department");
        Department.setBounds(400,400,200,30);
        Department.setFont(new Font("serif", Font.BOLD,20));
        add(Department);

        String department[] = {"Information Technology","Computer Science","Electronics","Mechanical","Civil"};
        DepartmentBox = new JComboBox(department);
        DepartmentBox.setBounds(600,400,150,30);
        DepartmentBox.setBackground(Color.WHITE);
        add(DepartmentBox);

        submit = new JButton("Submit");
        submit.setBounds(250,500,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450,500,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);




        setSize(900,700);
        setLocationRelativeTo(null); // Center the frame on screen
//        setLocation(350,50);
        setLayout(null);
        setVisible(true);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);

    }
    public static void main(String[] args){
        new AddFaculty();

    }
}

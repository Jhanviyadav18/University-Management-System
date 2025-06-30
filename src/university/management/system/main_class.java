package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        // new Information

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studenInfo =new JMenuItem("New Student Information");
        studenInfo.addActionListener(this);
        studenInfo.setBackground(Color.WHITE);
        newInfo.add(studenInfo);

        //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        details.addActionListener(this);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studendetails =new JMenuItem("View Student Details");
        studendetails.setBackground(Color.WHITE);
        studendetails.addActionListener(this);
        details.add(studendetails);

        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        leave.addActionListener(this);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studendleave =new JMenuItem("Student Leave");
        studendleave.setBackground(Color.WHITE);
        studendleave.addActionListener(this);
        leave.add(studendleave);

        //Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        leaveDetails.addActionListener(this);
        mb.add(leaveDetails);

        JMenuItem facultyleaveDetail = new JMenuItem("Faculty Leave Details");
        facultyleaveDetail.setBackground(Color.WHITE);
        facultyleaveDetail.addActionListener(this);
        leaveDetails.add(facultyleaveDetail);

        JMenuItem studendleaveDetail =new JMenuItem("Student Leave Details");
        studendleaveDetail.setBackground(Color.WHITE);
        studendleaveDetail.addActionListener(this);
        leaveDetails.add(studendleaveDetail);

        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        exam.addActionListener(this);
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
        ExaminationDetails.setBackground(Color.WHITE);
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks =new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.WHITE);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);

        //update Info
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.addActionListener(this);
        mb.add(updateInfo);

        JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Details");
        updatefacultyInfo.setBackground(Color.WHITE);
        updatefacultyInfo.addActionListener(this);
        updateInfo.add(updatefacultyInfo);

        JMenuItem updatestudentInfo =new JMenuItem("Update Student Details");
        updatestudentInfo.setBackground(Color.WHITE);
        updatestudentInfo.addActionListener(this);
        updateInfo.add(updatestudentInfo);

        // Fees
        JMenu fees = new JMenu("Fee Details");
        fees.setForeground(Color.BLACK);
        fees.addActionListener(this);
        mb.add(fees);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fees.add(feestructure );

        JMenuItem feeForm =new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fees.add(feeForm);

        // utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        utility.addActionListener(this);
        mb.add(utility);

        JMenuItem Calculator = new JMenuItem("Calculator");
        Calculator.setBackground(Color.WHITE);
        Calculator.addActionListener(this);
        utility.add(Calculator);


        JMenuItem Notepad =new JMenuItem("Notepad");
        Notepad.setBackground(Color.WHITE);
        Notepad.addActionListener(this);
        utility.add(Notepad);

        // About
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        about.addActionListener(this);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.WHITE);
        About.addActionListener(this);
        about.add(About);

        // Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        exam.addActionListener(this);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add( Exit);


        setJMenuBar(mb);


        setSize(1540,850);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if(sm.equals("Exit")){
            System.exit(15);
        }else if (sm.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (sm.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (sm.equals("New Faculty Information")) {
            new AddFaculty();
        } else if (sm.equals("New Student Information")) {
            new AddStudent();
        } else if (sm.equals("View Faculty Details")) {
            new TeacherDetail();
        } else if (sm.equals("View Student Details")) {
            new studentDetails();
        }else if (sm.equals("Faculty Leave")) {
            new TeacherLeave();
        }else if (sm.equals("Student Leave")) {
            new StudentLeave();
        }else if (sm.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        }else if (sm.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }else if (sm.equals("Update Faculty Details")) {
            new UpdateTeacher();
        }
        else if (sm.equals("Update Student Details")) {
            new updateStudent();
        }
        else if (sm.equals("Enter Marks")) {
            new EnterMarks();
        }
        else if (sm.equals("Examination Results")) {
            new ExaminationDetails();
        }else if (sm.equals("Fee Structure")) {
            new FeesStructure();
        }else if (sm.equals("Student Fee Form")) {
            new StudenFeeForm();
        }else if (sm.equals("About")) {
            new About();
        }

    }
    public static void main(String[] args) {
        new main_class();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author baabjibril
 */

import java.sql.Connection;
import java.io.File;
import javax.sound.sampled.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiClass extends JFrame implements ActionListener{
        
    // Class constructor
    public guiClass() {
        welcomePage(); 
        
    }
    
   
    
    private void studentInfoPageFrame() {
        // student info page
        /* contains {
        student info,
        course catalog,
        student registration,
        student financial responsibility,
        student academic record

        */

        JFrame studentInfoPageFrame = new JFrame();
        studentInfoPageFrame.setSize(500, 500);
        studentInfoPageFrame.setVisible(true);
        studentInfoPageFrame.setTitle("Student Information Portal");
        studentInfoPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with GridLayout to hold buttons
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 5, 5));

        // Student Info Btn
        JButton addNewStudentInfo = new JButton("Add Student Info");
        addNewStudentInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentPersonalInfo();
                
            }
        });

        // course catalog btn
        JButton viewCourseCatalog = new JButton("View Course Catalog");
        viewCourseCatalog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCourseCatalog();
            }
        });

        // student academicr record btn
        JButton addStudentRegistration = new JButton("Add Student Registration");
        addStudentRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showStudentAcademicRecord();
            }
        });

        // student financial responsibility btn
        JButton addStudentFinancialResponsibility = new JButton("Add Student Financial Responsibility");
        addStudentFinancialResponsibility.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showStudentFinances();
            }
        });

        // student academic record btn
        JButton studentAcademicRecord = new JButton("View Student Academic Record");
        studentAcademicRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        // Add buttons to the button panel
        buttonPanel.add(addNewStudentInfo);
        buttonPanel.add(viewCourseCatalog);
        buttonPanel.add(addStudentRegistration);
        buttonPanel.add(addStudentFinancialResponsibility);
        buttonPanel.add(studentAcademicRecord);

        // Set layout manager for the main frame
        studentInfoPageFrame.setLayout(new BorderLayout());

        // Add the button panel to the main frame
        studentInfoPageFrame.add(buttonPanel, BorderLayout.CENTER);
}

    
    
    
    
    
    
    private void welcomePage() {
        JFrame welcomePageFrame = new JFrame();
        welcomePageFrame.setLayout(new BorderLayout());

        welcomePageFrame.setSize(500, 500);
        welcomePageFrame.setVisible(true);
        welcomePageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomePageFrame.setTitle("University of Beaver");

        JLabel welcomeText = new JLabel();
        welcomeText.setText("Welcome to University Of Beaver");

        JLabel welcomeOptionText = new JLabel();
        welcomeOptionText.setText("Please choose one of the following options: ");

        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new GridLayout(2, 1, 5, 5));

        welcomePanel.add(welcomeText);
        welcomePanel.add(welcomeOptionText);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 5, 5));

        // addStudentBtn takes you to the degreeChoice page
        JButton addStudentBtn = new JButton("Add Student");
        addStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                degreeChoice();
            }
        });

        // viewStudentBtn takes you to a list of the students
        JButton viewStudentBtn = new JButton("View Student");
        viewStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // shows a list of all students from the database
            }
        });

        // Set preferred size for the buttons
        addStudentBtn.setPreferredSize(new Dimension(15, 5));
        viewStudentBtn.setPreferredSize(new Dimension(15, 5));

        // Add buttons to the button panel
        buttonPanel.add(addStudentBtn);
        buttonPanel.add(viewStudentBtn);

        // Add panels to the frame
        welcomePageFrame.add(welcomePanel, BorderLayout.NORTH);
        welcomePageFrame.add(buttonPanel, BorderLayout.CENTER);
}


    
    //
    private void studentPersonalInfo() {
        JFrame componentsFrame = new JFrame();
        componentsFrame.setVisible(true);
        componentsFrame.setSize(500, 500);
        componentsFrame.setTitle("Student Information Page");

        JPanel panel = new JPanel();

        setLayout(new BorderLayout()); // Use BorderLayout for the main frame

        // Student Personal Information
        JLabel studentIdLabel = new JLabel("Student ID: ");
        JTextField studentIdField = new JTextField();
        JButton saveStudentId = new JButton("Save");

        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();
        JButton saveFirstName = new JButton("Save");

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();
        JButton saveLastName = new JButton("Save");

        JLabel DOBLabel = new JLabel("Date of Birth:");
        JTextField DOBField = new JTextField();
        JButton saveDOB = new JButton("Save");

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();
        JButton saveAddress = new JButton("Save");

        JLabel phoneNoLabel = new JLabel("Phone Number:");
        JTextField phoneNoField = new JTextField();
        JButton savePhoneNo = new JButton("Save");

        JLabel emergContactNameLabel = new JLabel("Emergency Contact Name:");
        JTextField emergContactNameField = new JTextField();
        JButton saveEmergContactName = new JButton("Save");

        JLabel emergContactNoLabel = new JLabel("Emergency Contact Number:");
        JTextField emergContactNoField = new JTextField();
        JButton saveEmergContactNo = new JButton("Save");

        // Set up the panel with GridLayout
        panel.setLayout(new GridLayout(10, 3, 5, 5));

        // Add components and submit buttons to the panel
        panel.add(studentIdLabel);
        panel.add(studentIdField);
        panel.add(saveStudentId);

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(saveFirstName);

        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(saveLastName);

        panel.add(DOBLabel);
        panel.add(DOBField);
        panel.add(saveDOB);

        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(saveAddress);

        panel.add(phoneNoLabel);
        panel.add(phoneNoField);
        panel.add(savePhoneNo);

        panel.add(emergContactNameLabel);
        panel.add(emergContactNameField);
        panel.add(saveEmergContactName);

        panel.add(emergContactNoLabel);
        panel.add(emergContactNoField);
        panel.add(saveEmergContactNo);
        
        
        JButton saveAllBtn = new JButton("Save All");
        saveAllBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(componentsFrame, "All data saved :))");
                

            }
        });
        
        panel.add(saveAllBtn);
        componentsFrame.add(panel);
    }
  
    
    private void degreeChoice() {
      
      JLabel title = new JLabel();
      title.setText("Choose one of the following options");
      
      JFrame choiceFrame = new JFrame();
      choiceFrame.setSize(500, 500);
      choiceFrame.setVisible(true);
      choiceFrame.setTitle("University of Beaver");
      choiceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Buttons for welcome page
      JButton freshman = new JButton("Freshmen");
      
      // Action Listener for Button
      freshman.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

              // opens student info page
              studentInfoPageFrame();


          }
      });
      
      
      JButton masters = new JButton("Masters Students");
      
      // Action Listener for Button
      masters.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
               
              // opens student info page
              studentInfoPageFrame();

          }
      });
      
      
      JButton phd = new JButton("Ph.D Students");
      
      // Action Listener for Button
      phd.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
               
              // opens student info page
                studentInfoPageFrame();
          }
      });
      

    // Set layout for the welcome frame
    choiceFrame.setLayout(new GridLayout(3, 1, 2, 2));

    // Add buttons to the welcome frame
    choiceFrame.add(freshman);
    choiceFrame.add(masters);
    choiceFrame.add(phd);
      
      
      
  }
    
    
    // Course Catalog
    private void showCourseCatalog() {
        JFrame courseCatalogFrame = new JFrame();       
        courseCatalogFrame.setVisible(true);
        courseCatalogFrame.setSize(500, 500);
        courseCatalogFrame.setTitle("University of Beaver Course Catalog");
        courseCatalogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // shows a list of courses with relevant info
        
        JPanel courseCatalogPanel = new JPanel();

        setLayout(new BorderLayout()); // Use BorderLayout for the main frame

        // Student Personal Information
        JLabel courseIDLabel = new JLabel("Course ID: ");
        JTextField courseLabelField = new JTextField();
        
        JLabel subjectLabel = new JLabel("Subject: ");
        JTextField subjectField = new JTextField();


        JLabel courseNameLabel = new JLabel("Course Name: ");
        JTextField courseNameField = new JTextField();


        JLabel creditsLabel = new JLabel("Credits: ");
        JTextField creditsField = new JTextField();


        JLabel professorLabel = new JLabel("Professor Label :");
        JTextField professorField = new JTextField();


        JLabel classCapacityLabel = new JLabel("Class Capacity: ");
        JTextField classCapacityField = new JTextField();


        JLabel scheduleLabel = new JLabel("Schedule: ");
        JTextField scheduleField = new JTextField();
        // Set up the panel with GridLayout
        courseCatalogPanel.setLayout(new GridLayout(10, 3, 5, 5));

        // Add components and submit buttons to the panel
        courseCatalogPanel.add(courseIDLabel);
        courseCatalogPanel.add(courseLabelField);


        courseCatalogPanel.add(subjectLabel);
        courseCatalogPanel.add(subjectField);

        courseCatalogPanel.add(courseNameLabel);
        courseCatalogPanel.add(courseNameField);

        courseCatalogPanel.add(creditsLabel);
        courseCatalogPanel.add(creditsField);

        courseCatalogPanel.add(professorLabel);
        courseCatalogPanel.add(professorField);

        courseCatalogPanel.add(classCapacityLabel);
        courseCatalogPanel.add(classCapacityField);

        courseCatalogPanel.add(scheduleLabel);
        courseCatalogPanel.add(scheduleField);
        
        
        
        JButton saveAllBtn = new JButton("Save All");
        saveAllBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(courseCatalogFrame, "All data saved :))");

            }
        });
        
        courseCatalogPanel.add(saveAllBtn);
        courseCatalogFrame.add(courseCatalogPanel);
        
        
        

    }
    
    // Registration/Academic Record
    private void showStudentAcademicRecord() {
        JFrame studentAcademicRecordFrame = new JFrame();
        studentAcademicRecordFrame.setVisible(true);
        studentAcademicRecordFrame.setSize(500, 500);
        studentAcademicRecordFrame.setTitle("Student Registration");
        studentAcademicRecordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Student Registration Form
        JPanel registrationPanel = new JPanel();

        setLayout(new BorderLayout()); // Use BorderLayout for the main frame

        // Student Personal Information
        JLabel enrollmentDateLabel = new JLabel("Enrollment Date: ");
        JTextField enrollmentDateField = new JTextField();
        JButton saveEnrollmentDate = new JButton("Save");

        JLabel enrollmentLevelLabel = new JLabel("Enrollment Level: ");
        JTextField enrollmentLevelField = new JTextField();
        JButton saveEnrollmentLevel = new JButton("Save");

        JLabel disciplineCodeLabel = new JLabel("Discipline Code: ");
        JTextField disciplineCodeField = new JTextField();
        JButton saveDisciplineCode = new JButton("Save");

        JLabel currentSemesterLabel = new JLabel("Current Semester");
        JTextField currentSemesterField = new JTextField();
        JButton saveCurrentSemester = new JButton("Save");

        JLabel expectedGraduationDateLabel = new JLabel("Expected Graduation Date :");
        JTextField expectedGraduationDateField = new JTextField();
        JButton saveExpectedGraduationDate = new JButton("Save");

        JLabel studentStandingLabel = new JLabel("Student Standing (GPA):");
        JTextField studentStandingField = new JTextField();
        JButton saveStudentStanding = new JButton("Save");


        JLabel registrationStatusLabel = new JLabel("Registration Status: ");
        JTextField registrationStatusField = new JTextField();
        JButton saveRegistrationStatus = new JButton("Save");

        // Set up the panel with GridLayout
        registrationPanel.setLayout(new GridLayout(10, 3, 5, 5));

        // Add components and submit buttons to the panel
        registrationPanel.add(enrollmentDateLabel);
        registrationPanel.add(enrollmentDateField);
        registrationPanel.add(saveEnrollmentDate);

        registrationPanel.add(enrollmentLevelLabel);
        registrationPanel.add(enrollmentLevelField);
        registrationPanel.add(saveEnrollmentLevel);

        registrationPanel.add(disciplineCodeLabel);
        registrationPanel.add(disciplineCodeField);
        registrationPanel.add(saveDisciplineCode);

        registrationPanel.add(currentSemesterLabel);
        registrationPanel.add(currentSemesterField);
        registrationPanel.add(saveCurrentSemester);

        registrationPanel.add(expectedGraduationDateLabel);
        registrationPanel.add(expectedGraduationDateField);
        registrationPanel.add(saveExpectedGraduationDate);

        registrationPanel.add(studentStandingLabel);
        registrationPanel.add(studentStandingField);
        registrationPanel.add(saveStudentStanding);

        registrationPanel.add(registrationStatusLabel);
        registrationPanel.add(registrationStatusField);
        registrationPanel.add(saveRegistrationStatus);
        
        
        
        JButton saveAllBtn = new JButton("Save All");
        saveAllBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(studentAcademicRecordFrame, "All data saved :))");

            }
        });
        
        registrationPanel.add(saveAllBtn);
        studentAcademicRecordFrame.add(registrationPanel);
        
        
        
    }
    
    private void showStudentFinances() {
        JFrame studentFinancesFrame = new JFrame();
        studentFinancesFrame.setVisible(true);
        studentFinancesFrame.setSize(500, 500);
        studentFinancesFrame.setTitle("Student Finances Portal");
        studentFinancesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Student Finances Form
        JPanel studentFinancesPanel = new JPanel();

        setLayout(new BorderLayout()); // Use BorderLayout for the main frame

        // Student Personal Information
        JLabel coursesEnrolledLabel = new JLabel("Courses Enrolled: ");
        JTextField coursesEnrolledField = new JTextField();
        JButton savecoursesEnrolled = new JButton("Save");

        JLabel CreditPerCourseLabel = new JLabel("Credit per Course: ");
        JTextField CreditPerCourseField = new JTextField();
        JButton saveCreditPerCourse = new JButton("Save");

        JLabel totalCostPerSemesterLabel = new JLabel("Total Cost Per Semester: ");
        JTextField totalCostPerSemesterField = new JTextField();
        JButton saveTotalCostPerSemester = new JButton("Save");

        JLabel costPaidLabel = new JLabel("Cost Paid: ");
        JTextField costPaidField = new JTextField();
        JButton saveCostPaid = new JButton("Save");

        JLabel scholarshipLabel = new JLabel("Scholarship :");
        JTextField scholarshipField = new JTextField();
        JButton saveScholarship = new JButton("Save");

        JLabel paymentPlanLabel = new JLabel("Payment Plan:");
        JTextField paymentPlanField = new JTextField();
        JButton savePaymentPlan = new JButton("Save");


        JLabel amountPaidLabel = new JLabel("Amount Paid: ");
        JTextField amountPaidField = new JTextField();
        JButton saveAmountPaid = new JButton("Save");
        
        JLabel amountDueLabel = new JLabel("Amount Due: ");
        JTextField amountDueField = new JTextField();
        JButton saveAmountDue = new JButton("Save");

        // Set up the panel with GridLayout
        studentFinancesPanel.setLayout(new GridLayout(10, 3, 5, 5));

        // Add components and submit buttons to the panel
        studentFinancesPanel.add(coursesEnrolledLabel);
        studentFinancesPanel.add(coursesEnrolledField);
        studentFinancesPanel.add(savecoursesEnrolled);

        studentFinancesPanel.add(CreditPerCourseLabel);
        studentFinancesPanel.add(CreditPerCourseField);
        studentFinancesPanel.add(saveCreditPerCourse);

        studentFinancesPanel.add(totalCostPerSemesterLabel);
        studentFinancesPanel.add(totalCostPerSemesterField);
        studentFinancesPanel.add(saveTotalCostPerSemester);

        studentFinancesPanel.add(costPaidLabel);
        studentFinancesPanel.add(costPaidField);
        studentFinancesPanel.add(saveCostPaid);

        studentFinancesPanel.add(scholarshipLabel);
        studentFinancesPanel.add(scholarshipField);
        studentFinancesPanel.add(saveScholarship);

        studentFinancesPanel.add(paymentPlanLabel);
        studentFinancesPanel.add(paymentPlanField);
        studentFinancesPanel.add(savePaymentPlan);

        studentFinancesPanel.add(amountPaidLabel);
        studentFinancesPanel.add(amountPaidField);
        studentFinancesPanel.add(saveAmountPaid);
        
        studentFinancesPanel.add(amountDueLabel);
        studentFinancesPanel.add(amountDueField);
        studentFinancesPanel.add(saveAmountDue);
        
        
        
        JButton saveAllBtn = new JButton("Save All");
        saveAllBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(studentFinancesFrame, "All data saved :))");
                

            }
        });
        
        studentFinancesPanel.add(saveAllBtn);
        studentFinancesFrame.add(studentFinancesPanel);
        
        
    }
    
    
    
    private void addNewStudent() {
        // Buttons
        JButton addNewStudentBtn = new JButton();
        addNewStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newStudentFrame = new JFrame();
                JLabel newStudentTitle = new JLabel();
                JPanel newStudentPanel = new JPanel();
                
                newStudentFrame.setSize(500, 500);
                newStudentFrame.setVisible(true);
                newStudentFrame.setTitle("New Students Page");
                
                
                
            }
        });
    }
    
    private void viewStudent() {
        JFrame viewStudent = new JFrame();
        JLabel viewStudentDetails = new JLabel();
        JPanel viewStudentPanel = new JPanel();
        
        viewStudent.setVisible(true);
        viewStudent.setTitle("List of Students");
        viewStudent.setSize(500, 500);
        viewStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add label to panel
        
        // add panel to frame
        
    }
    
    
  
     //@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
   
    }

    
}







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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentPersonalInfo {

    // Class variables

    private String studentId;
    private String firstName;
    private String lastName;
    private String DOB;
    private String address;
    private int phoneNo;
    private String emergContactName;
    private int emergContactNo;



    // Class Constructor
    public StudentPersonalInfo(String studentId, String firstName, String lastName, String DOB, String address, int phoneNo, String emergContactName, int emergContactNo) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emergContactName = emergContactName;
        this.emergContactNo = emergContactNo;
        
    }


    // Functions 
    
    public void insertIntoDatabase() {
        
        String url = "jdbc:mysql://localhost:3306/UniversityOfBeaver";
        String user = "root";
        String password = "BlackopsI$115";

        // SQL query to insert a new student
        String insertQuery = "INSERT INTO students (student_id, first_name, last_name, dob, address, phone_no, emerg_contact_name, emerg_contact_no) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (
            // Establish connection
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
        ) {
            
            preparedStatement.setString(1, studentId);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, DOB);
            preparedStatement.setString(5, address);
            preparedStatement.setInt(6, phoneNo);
            preparedStatement.setString(7, emergContactName);
            preparedStatement.setInt(8, emergContactNo);

            
            preparedStatement.executeUpdate();

            System.out.println("Student added to the database!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Getter Functions

    public String getStudentID() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNo() {
        return phoneNo;
        
    }

    public String getEmergencyContactName() {
        return emergContactName;
    }

    public int getEmergencyContactNo() {
        return emergContactNo;
    }



    // Setter Functions

    public void setStudentID(String studentID) {
        this.studentId = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setDOB(String DOB) {
        this.DOB = DOB;

    }

    public void setAddress(String address) {
        this.address = address;

    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmergencyContactName(String emergContactName) {
        this.emergContactName = emergContactName;

    }

    public void setEmergencyContactNo(int emergContactNo) {
        this.emergContactNo = emergContactNo;

    }
}


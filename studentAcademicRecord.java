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

public class studentAcademicRecord {

    // Class variables
    protected String enrollmentDate;
    private String enrollmentLevel;
    private String disciplineCode;
    private String currentSemester;
    private String expectedGraduationDate;
    private int studentStanding;
    private String registrationStatus;


    // Class Constructor
    public studentAcademicRecord(String enrollmentDate, String enrollmentLevel, String disciplineCode, String currentSemester, String expectedGraduationDate, int studentStanding, String registrationStatus) {
        this.enrollmentDate = enrollmentDate;
        this.enrollmentLevel = enrollmentLevel;
        this.disciplineCode = disciplineCode;
        this.currentSemester = currentSemester;
        this.expectedGraduationDate = expectedGraduationDate;
        this.studentStanding = studentStanding;
        this.registrationStatus = registrationStatus;
    }
    
    // Functions
    public void insertIntoDatabase() {
    // JDBC URL, username, and password of MySQL server
    String url = "jdbc:mysql://localhost:3306/UniversityOfBeaver";
    String user = "root";
    String password = "BlackopsI$115";

   
    String insertQuery = "INSERT INTO student_academic_record (enrollment_date, enrollment_level, discipline_code, current_semester, expected_graduation_date, student_standing, registration_status) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (
        // Establish connection
        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
    ) {
        
        preparedStatement.setString(1, enrollmentDate);
        preparedStatement.setString(2, enrollmentLevel);
        preparedStatement.setString(3, disciplineCode);
        preparedStatement.setString(4, currentSemester);
        preparedStatement.setString(5, expectedGraduationDate);
        preparedStatement.setDouble(6, studentStanding);
        preparedStatement.setString(7, registrationStatus);

        // Execute the insert query
        preparedStatement.executeUpdate();

        System.out.println("Student academic record added to the database!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    // Student Record Getter Functions
    public String getEnrollmentDate() {
        return null;
    }

    public String getEnrollmentLevel() {
        return null;
    }

    public String getDisciplineCode() {
        return null;
    }

    public String getCurrentSemester() {
        return null;
    }

    public String getExpectedGraduationDate() {
        return null;
    }

    public String getStudentStanding() {
        return null;
    }

    public String getStudentRegistrationStatus() {
        return null;
    }


    // Student Record Setter Functions

    public void setEnrollmentDate() {

    }

    public void setEnrollmentLevel() {
        
    }

    public void setDisciplineCode() {
      
    }

    public void setCurrentSemester() {
        
    }

    public void setExpectedGraduationDate() {

    }

    public void setStudentStanding() {

    }

    public void setStudentRegistrationStatus() {

    }

    // Main functions

    public String addNewStudent() {
        return null;

    }

    public String addExistingStudent() {
        return null;
    }

    public String assignCourse() {
        return null;
    }




}

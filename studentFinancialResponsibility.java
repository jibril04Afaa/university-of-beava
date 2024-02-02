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

public class studentFinancialResponsibility{

    // Class variables
    private int[] coursesEnrolled;
    private int CreditPerCourse;
    private double totalCostPerSemester;
    private double costPaid;
    private String scholarship;
    private String paymentPlan;
    private String amountPaid;
    private String amountDue;


    // Class Constructor
    public studentFinancialResponsibility(int[] coursesEnrolled,int CreditPerCourse, double totalCostPerSemester,double costPaid, String scholarship,String paymentPlan, String amountPaid, String amountDue) {
        this.coursesEnrolled = coursesEnrolled;
        this.CreditPerCourse = CreditPerCourse;
        this.totalCostPerSemester = totalCostPerSemester;
        this.costPaid = costPaid;
        this.scholarship = scholarship;
        this.paymentPlan = paymentPlan;
        this.amountPaid = amountPaid;
        this.amountDue = amountDue;
    }


    // Functions 
    public void insertIntoDatabase() {
    String url = "jdbc:mysql://localhost:3306/UniversityOfBeaver";
    String user = "root";
    String password = "BlackopsI$115";

    // SQL query to insert a new student financial responsibility record
    String insertQuery = "INSERT INTO student_financial_responsibility (courses_enrolled, credit_per_course, total_cost_per_semester, cost_paid, scholarship, payment_plan, amount_paid, amount_due) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (
        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
    ) {
        
        preparedStatement.setString(1, coursesEnrolled);
        preparedStatement.setDouble(2, creditPerCourse);
        preparedStatement.setDouble(3, totalCostPerSemester);
        preparedStatement.setDouble(4, costPaid);
        preparedStatement.setDouble(5, scholarship);
        preparedStatement.setString(6, paymentPlan);
        preparedStatement.setDouble(7, amountPaid);
        preparedStatement.setDouble(8, amountDue);

        preparedStatement.executeUpdate();

        System.out.println("Student financial responsibility added to the database!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    // Getter Functions
    public int getCoursesEnrolled() {
        return 0;
    }

    public int getCreditPerCourse() {
        return 0;
    }

    public double getTotalCostPerSemester() {
        return 0.0;
    }

    public double getCostPaid() {
        return 0.0;
    }

    public String getScholarship() {
        return null;
    }

    public String getPaymentPlan() {
        return null;
    }

    public double getAmountPaid() {
        return 0.0;
    }

    public double getAmountDue() {
        return 0.0;
    }
    


    // Setter Functions

    public void setCoursesEnrolled() {

    }

    public void setCreditPerCourse() {

    }

    public void setTotalCostPerSemester() {
       
    }

    public void setCostPaid() {
        
    }

    public void setScholarship() {
        
    }

    public void setPaymentPlan() {
        
    }

    public void setAmountPaid() {
        
    }

    public void setAmountDue() {
        
    }


    // Main Functions

    public void printInvoice() {

    }

}


/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  baabjibril
 * Created: Dec 6, 2023
 */

CREATE TABLE StudentFinancialResponsibility (
    studentId INT PRIMARY KEY,
    coursesEnrolled INT,
    creditPerCourse DECIMAL(3, 2),
    totalCostPerSemester DECIMAL(10, 2),
    costPaid DECIMAL(10, 2),
    scholarship DECIMAL(10, 2),
    paymentPlan VARCHAR(255),
    amountPaid DECIMAL(10, 2),
    amountDue DECIMAL(10, 2)
);

INSERT INTO StudentFinancialResponsibility (studentId, coursesEnrolled, creditPerCourse, totalCostPerSemester, costPaid, scholarship, paymentPlan, amountPaid, amountDue)
VALUES
(1, 4, 3.0, 12000.00, 8000.00, 2000.00, 'Installments', 3000.00, 9000.00),
(2, 3, 4.0, 15000.00, 10000.00, 2500.00, 'Full Payment', 10000.00, 5000.00);
/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  baabjibril
 * Created: Dec 6, 2023
 */

CREATE TABLE StudentAcademicRecord (
    studentId INT PRIMARY KEY,
    enrollmentDate DATE,
    enrollmentLevel VARCHAR(50),
    disciplineCode VARCHAR(10),
    currentSemester INT,
    expectedGraduationDate DATE,
    studentStanding DECIMAL(3, 2),
    registrationStatus VARCHAR(50)
);

INSERT INTO StudentAcademicRecord (studentId, enrollmentDate, enrollmentLevel, disciplineCode, currentSemester, expectedGraduationDate, studentStanding, registrationStatus)
VALUES
(1, '2022-09-01', 'Undergraduate', 'EE310', 2, '2024-05-01', 3.5, 'Registered'),
(2, '2022-09-01', 'Graduate', 'MS201', 1, '2023-12-01', 3.8, 'Not Registered');

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  baabjibril
 * Created: Dec 6, 2023
 */


CREATE TABLE StudentPersonalInfo (
    studentId INT PRIMARY KEY,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    dateOfBirth DATE,
    address VARCHAR(255),
    phoneNumber VARCHAR(20),
    emergencyContactName VARCHAR(255),
    emergencyContactNumber VARCHAR(20)
);

INSERT INTO StudentPersonalInfo (studentId, firstName, lastName, dateOfBirth, address, phoneNumber, emergencyContactName, emergencyContactNumber)
VALUES
(1, 'John', 'Doe', '1990-01-15', '123 Main St', '555-1234', 'Jane Doe', '555-5678'),
(2, 'Alice', 'Smith', '1995-03-22', '456 Oak St', '555-8765', 'Bob Smith', '555-4321');

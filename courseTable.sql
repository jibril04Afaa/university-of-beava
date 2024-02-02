/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  baabjibril
 * Created: Dec 6, 2023
 */

-- Create Course table
CREATE TABLE Course (
    courseID INT PRIMARY KEY,
    subject VARCHAR(255),
    courseName VARCHAR(255),
    credits INT,
    professor VARCHAR(255),
    classCapacity INT,
    schedule VARCHAR(255)
);


INSERT INTO Course (courseID, subject, courseName, credits, professor, classCapacity, schedule)
VALUES (1, 'CMPSC 221', 'OOP with Web-Based Applications', 3, 'Madhurima Ray', 15, 'MWF 10:00 AM - 11:30 AM');

INSERT INTO Course (courseID, subject, courseName, credits, professor, classCapacity, schedule)
VALUES (2, 'NW 310', 'Nuclear Weaponry', 4, 'Prof. Johnson', 25, 'TTH 2:00 PM - 3:30 PM');


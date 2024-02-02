/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author baabjibril
 */
public class Main {
    public static void main(String[] args) {
        guiClass GUI = new guiClass();
        StudentPersonalInfo madhurima = new StudentPersonalInfo("1234", "madhurima", "ray", "1995", "110 university drive", 412, "madhurima's mom", 4122);
        madhurima.insertIntoDatabase();

        
    }
    
}

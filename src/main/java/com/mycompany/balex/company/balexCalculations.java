/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balex.company;

/**
 *
 * @author CLIENT
 */
class balexCalculations {
    public void calculatePay(double basePay,int hoursWorked){
        double minimumWage = 8.00;
        int maxHours = 60;
        int overtimeDuration = 40;
        double overtimeRate = 1.5;
        
        //Check if base pay is less than minimum wage
        if (basePay < minimumWage){
            System.out.println("Error:Base pay must be atleast $8.00 per hour");
            //Exist the method if the base pay is invalid
        }
        
        //Check if hours worked exceed maximum allowed hours
        if (hoursWorked >  maxHours){
            System.out.println("Hours worked must not exceed 60 hours per week");
            //Exit the method if hours worked exceed the limit
        }
        //Calculate regular and overtime hours
        int regularHours = Math.min(hoursWorked, overtimeDuration);
        int overtimeHours = Math.max(0, hoursWorked-overtimeDuration);
        
        //Calculate total pay
        double totalPay = (regularHours * basePay) + (overtimeHours* basePay* overtimeRate);
        //Print the total pay
        System.out.println("Total Pay: $" + totalPay);
    }
    
}

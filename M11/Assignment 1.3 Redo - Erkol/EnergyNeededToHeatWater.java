/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *CSD402-340A - Java for Programmers
 * Assignment 1.3
 * Mirach Erkol
 * 1/18/2026
 * @author Mike
 */

import java.util.Scanner;

public class EnergyNeededToHeatWater {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
     //1) Prompt users to input water in kilograms, initial temperature, and final temperature    
    
        //Prompt user for water mass in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterInKilograms = input.nextDouble();
        
        //Prompt user for initial temperature
        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = input.nextDouble();
        
        //Prompot user for final temperature
        System.out.print("Enter the final temperature of the water in Celsius: ");
        double finalTemperature = input.nextDouble();
        
     //2) Perform calculation
        double energyNeeded;
        energyNeeded = waterInKilograms * ( finalTemperature - initialTemperature ) * 4184;
    
    
     //3) Display results to user
        System.out.println("The energy needed in joules = " + energyNeeded);
        
    } 
}
    

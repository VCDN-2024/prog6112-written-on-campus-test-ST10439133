/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accidentreports;

/**
 *
 * @author camryn naidoo St10439133
 */
import java.util.Scanner;
public class AccidentReports 
{

    
    public static void main(String[] args) 
    {
     
        Scanner input = new Scanner(System.in);

        // Constants
        final int CITIES = 3;
        String[] cityNames = new String[CITIES];
        int[][] accidents = new int[CITIES][2]; // 0: Car accidents, 1: Motorbike accidents

        // Input city names
        for (int i = 0; i < CITIES; i++) {
            System.out.print("Enter the name of city " + (i + 1) + ": ");
            cityNames[i] = input.nextLine();
        }

        // Input number of accidents for each city
        for (int i = 0; i < CITIES; i++) {
            System.out.println("Entering accident data for " + cityNames[i]);

            System.out.print("Enter the number of car accidents: ");
            accidents[i][0] = input.nextInt();

            System.out.print("Enter the number of motorbike accidents: ");
            accidents[i][1] = input.nextInt();
            input.nextLine(); // Clear the newline
        }

        // Display the summary report
        System.out.println("---------------------------------------------------------------------");
        System.out.println("ACCIDENT COMPARISON REPORT");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s\n", "City", "Car Accidents", "Motorbike Accidents");

        for (int i = 0; i < CITIES; i++) {
            System.out.printf("%-20s %-15d %-15d\n", cityNames[i], accidents[i][0], accidents[i][1]);
        }

        // Calculate total accidents and determine the city with the most accidents
        int totalCarAccidents = 0;
        int totalMotorbikeAccidents = 0;
        String maxAccidentCity = cityNames[0];
        int maxAccidents = accidents[0][0] + accidents[0][1];

        for (int i = 0; i < CITIES; i++) {
            totalCarAccidents += accidents[i][0];
            totalMotorbikeAccidents += accidents[i][1];
            int totalAccidentsInCity = accidents[i][0] + accidents[i][1];
            
            if (totalAccidentsInCity > maxAccidents) {
                maxAccidents = totalAccidentsInCity;
                maxAccidentCity = cityNames[i];
            }
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Total Car Accidents: %d\n", totalCarAccidents);
        System.out.printf("Total Motorbike Accidents: %d\n", totalMotorbikeAccidents);
        System.out.printf("City with the most accidents: %s\n", maxAccidentCity);
        System.out.println("---------------------------------------------------------------------");

        input.close();
    }
    }
    

//Title: Update Code For Wildlife Sightings
//Author: ChatGPT
//Date:N/A
//Code version:1
//Availability: https://chatgpt.com/


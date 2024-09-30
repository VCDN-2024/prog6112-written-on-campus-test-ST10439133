/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author camryn naidoo ST10439133
 */
import javax.swing.JOptionPane;
public class RunApplication 
{

   
    public static void main(String[] args) 
    {
      
       {
        // Prompt the user for details
        String vehicleType = JOptionPane.showInputDialog("Enter the vehicle type (Car/Motorbike):");
        String city = JOptionPane.showInputDialog("Enter the name of City:");
        int numberOfAccidents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of accidents in total:"));

        // Create a report object
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, numberOfAccidents);

        // Generate and display the report
        String reportOutput = report.generateReport();
        JOptionPane.showMessageDialog(null, reportOutput, "Accident Report", JOptionPane.INFORMATION_MESSAGE);
    }
    }
}
    

//Title: Java Code For Environmental Incident Report
//Author: ChatGPT
//Date:N/A
//Code version:1
//Availability: https://chatgpt.com/
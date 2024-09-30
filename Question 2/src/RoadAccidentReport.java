/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camryn naidoo ST10439133
 */
 class RoadAccidentReport extends RoadAccident
{
     public RoadAccidentReport(String vehicleType, String city, int numberOfAccidents) 
    {
        super(vehicleType, city, numberOfAccidents);
    }

    public String generateReport() 
    {
        return String.format("Vehicle Type: %s\nCity: %s\nNumber of Accidents: %d",
                             getVehicleType(), getCity(), getNumberOfAccidents());
    }
}

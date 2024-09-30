/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camryn naidoo ST10439133
 */
public class RoadAccident  implements IRoadAccident
{
   private String vehicleType;
    private String city;
    private int numberOfAccidents;

    public RoadAccident(String vehicleType, String city, int numberOfAccidents) 
    {
        this.vehicleType = vehicleType;
        this.city = city;
        this.numberOfAccidents = numberOfAccidents;
    }

    @Override
    public String getVehicleType() 
    {
        return vehicleType;
    }

    @Override
    public String getCity() 
    {
        return city;
    }

    @Override
    public int getNumberOfAccidents() 
    {
        return numberOfAccidents;
    }
} 


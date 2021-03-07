/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10c_j;

/**
 *
 * @author ALEW
 */
public class Vehicle {
    private Integer wheels;
    private Integer gallons;

    public Vehicle(Integer wheels, Integer gallons) {
        this.wheels = wheels;
        this.gallons = gallons;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "wheels=" + wheels + ", gallons=" + gallons + '}';
    }
    
    
}

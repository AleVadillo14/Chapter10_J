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
public class UseVehicles {
    public static void useVehicles(){
        MotorCycle motorCycle = new MotorCycle(100);
    Car car = new Car(150);
        System.out.println(motorCycle.toString());
        System.out.println(car.toString());
    }
}

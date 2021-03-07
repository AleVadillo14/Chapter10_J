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
public class DemoCabinRental {
    public static void demoCabinRental(){
        CabinRental cabinRental = new CabinRental(3);
        HolidayCabinRental h = new HolidayCabinRental(3);
        System.out.println("El cuarto No."+cabinRental.getNumber()+" cuesta $"+cabinRental.getRate());
        System.out.println("El cuarto No."+h.getNumber()+" cuesta $"+h.getRate());
    }
}

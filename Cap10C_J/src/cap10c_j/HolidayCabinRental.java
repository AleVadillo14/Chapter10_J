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
public class HolidayCabinRental extends CabinRental {

    public HolidayCabinRental(Integer number) {
        super(number);
        super.setRate(super.getRate()+150.0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10_j;

/**
 *
 * @author ALEW
 */
public class ScentedCandle extends Candle {
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    
    @Override
    public void setAltura(Integer altura) {
        super.setAltura(altura);
        precio = (double)altura*3;
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "ScentedCandle{" + "Aroma = " + scent + '}';
    }
    
}

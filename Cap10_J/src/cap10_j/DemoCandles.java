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
public class DemoCandles {
    public static void demoCandles() {
        //Vela normal
        Candle c1 = new Candle();
        c1.setColor(Color.BLACK);
        c1.setAltura(10);
        //Vela con aroma
        ScentedCandle c2 = new ScentedCandle();
        c2.setColor(Color.WHITE);
        c2.setScent("Vainilla");
        c2.setAltura(10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

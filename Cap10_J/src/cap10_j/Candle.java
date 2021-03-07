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
public class Candle {
    private Color color;
    private Integer altura;
    protected Double precio;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
        this.precio = (double)altura*2;
    }

    public Double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Candle{" + "color = " + color + ", altura = " + altura + ", precio = " + precio + '}';
    }
    
}

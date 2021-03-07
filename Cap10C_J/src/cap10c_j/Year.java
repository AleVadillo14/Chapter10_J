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
public class Year{
    private Integer days;
    
    public Year(){
        this.days = 365;
    }
    
    public Year(Integer year){
        this.days = 366;
    }

    public Integer getDays() {
        return days;
    }

}

class UseYear {
    public static void useYear(){
        Year year = new Year();
        LeapYear leapYear = new LeapYear();
        System.out.println("Class Year="+year.getDays());
        System.out.println("Class Leap Year="+leapYear.getDays());
    }
}

class LeapYear extends Year {

    public LeapYear(){
        super(366);
    }
}
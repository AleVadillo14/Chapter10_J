/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10e_j;

import cap10_.caseproblems.DinnerEventDemo;
import cap10_.caseproblems.LessonWithRentalDemo;
import cap10_.gamezone.CreateAliens;
import cap10_.gamezone.TestLoadedDie;

/**
 *
 * @author ALEW
 */
public class Cap10E_J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GAME ZONE
        CreateAliens.createAliens();
        TestLoadedDie.testLoadedDie();
        //CASE PROBLEMS
        DinnerEventDemo.dinnerEventDemo();
        LessonWithRentalDemo.lessonWithRentalDemo();
    }
    
}

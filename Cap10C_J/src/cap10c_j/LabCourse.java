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
public class LabCourse extends CollegeCourse{

    public LabCourse(Course department, Integer number, Integer credits) {
        super(department, number, credits);
        setFee(getFee()+50);
    }
    
}

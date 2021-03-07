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
public class UseCourse {
    public static void useCourse(){
        CollegeCourse collegeCourse = new CollegeCourse(Course.ART,31,2);
        LabCourse labCourse = new LabCourse(Course.BIO,1,4);
        
        System.out.println(collegeCourse.toString());
        System.out.println(labCourse.toString());
    }
}

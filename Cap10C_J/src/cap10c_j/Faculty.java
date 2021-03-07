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
public class Faculty extends CollegeEmployee{
    private Boolean tenured;

    public Faculty(Boolean tenured, Integer social_security, Integer salary, String departament) {
        super(social_security, salary, departament);
        this.tenured = tenured;
    }

    @Override
    public String toString() {
        
        return "Faculty{" + "tenured=" + tenured + "}\n"+
                super.toString();
    }
    
}

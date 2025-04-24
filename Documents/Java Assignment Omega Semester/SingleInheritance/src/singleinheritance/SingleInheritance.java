/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleinheritance;

/**
 *
 * @author Gift Umoh
 */
public class SingleInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.provides();
        c.errands();
    }
    
}

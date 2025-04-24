/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hierachical_inheritance;

/**
 *
 * @author Gift Umoh
 */
public class Hierachical_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ANIMAL a = new ANIMAL();
        WildAnimal w = new WildAnimal();
        DomesticAnimal d = new DomesticAnimal();
        a.type();
        w.wild();
        d.domestic();
    }
    
}

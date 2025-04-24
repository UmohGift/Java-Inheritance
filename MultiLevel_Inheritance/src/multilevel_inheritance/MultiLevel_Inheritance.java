/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multilevel_inheritance;

/**
 *
 * @author Gift Umoh
 */
public class MultiLevel_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Bear b = new Bear();
        a.extinct();
        a.nature();
        m.feed();
        m.givebirth();
        b.makesound();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author SystemFive
 */
public class Pewarisan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        komputer kom = new komputer();
        kom.cetakInfo();
        System.out.print("\n");
        
        dekstop deks1 = new dekstop();
        deks1.cetakInfo();
        
        System.out.print("\n");
        dekstop deks2 = new dekstop("G41D3C","Pentium R Dual Core");
        deks2.setMemori(4);
        deks2.setMerk("Simbada");
        deks2.cetakInfo();
        
        System.out.print("\n");
        laptop lap1  = new laptop();
        lap1.cetakInfo();
        
        System.out.print("\n");
        laptop lap2  = new laptop("Asus ROG","Pentium 4");
        lap2.setMemori(500);
        lap2.setMerk("Asus");
        lap2.cetakInfo();
        
      
        
    }
    
}

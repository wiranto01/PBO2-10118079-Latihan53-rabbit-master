/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan53.rabbit;

/**
 *
 * @author User
 */
public class PBO210118079Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int legs = 4;
        // TODO code application logic here
       rabbit hasil = new rabbit("food", false, "color", legs, "nama");
       hasil.getName();
       hasil.isVegetarian();
       hasil.getEats();
       hasil.getNoOflegs();
       hasil.getColor();
    }
    
}

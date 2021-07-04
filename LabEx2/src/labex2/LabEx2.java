/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;

import StringInterface.StringInterface;
import StringInterface.TestStringInterface;

/**
 *
 * @author hp
 */
public class LabEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     StringInterface x  = (h, m) -> h.length() >= m.length();
     boolean t = x.TestString("Heba", "Raslan");
     System.out.println(t);
     
     TestStringInterface z = c ->
     {
        for (int i =0; i<c.length();i ++){
            if (!Character.isLetter(c.charAt(i))){
               return false;
            }
         
         
         }
          return true;

     };
        boolean y = z.IsLetter("M");
        System.out.println(y);
     
    }
    
}
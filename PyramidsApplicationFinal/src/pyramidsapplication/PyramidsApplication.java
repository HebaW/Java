 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidsapplication;

import Dao.PyramidsDaoImp;
import Pyramids.Pyramids;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class PyramidsApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidsDaoImp data =new PyramidsDaoImp();
        List<Pyramids> l = data.getAllPyramidsFromTxt("C:\\Users\\hp\\Documents\\pyramids2.csv");
        System.out.println(l);
        
        int len_Pyramids=l.size();
        int Median=len_Pyramids/2;
        int First_q= Median/2;
        int Third_q=Median+First_q;
        
        double median = l.stream().map((t) -> {
            return t.getBase1_m(); 
        }).sorted().collect(Collectors.toList()).get(Median);
        System.out.println("Median : " + median);
        
        double firstQ = l.stream().map((t) -> {
            return t.getBase1_m(); 
        }).sorted().collect(Collectors.toList()).get((int) (First_q));
        System.out.println("Lower quarter : " + firstQ);
        
        double secoundQ= l.stream().map((t) -> {
            return t.getBase1_m(); 
        }).sorted().collect(Collectors.toList()).get((int)(Third_q));
        System.out.println("Upper Quarter : " + secoundQ);
        
    }
        
    }
    


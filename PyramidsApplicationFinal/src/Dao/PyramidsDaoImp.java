/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Pyramids.Pyramids;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class PyramidsDaoImp implements PyramidsDao {

    @Override
    public List<Pyramids> getAllPyramidsFromTxt(String path) {
       List<Pyramids> AllPyramids = new ArrayList();
        try {
            Scanner sc = new Scanner (new File(path));
            if (sc.hasNextLine()){
                sc.nextLine();
            }
            while (sc.hasNextLine()){
                String Line = sc.nextLine();
                String [] parts = Line.split("," , -1);
                Pyramids P = new Pyramids (
                        parts[0] ,
                        parts[1],
                        parts[2],
                        !"".equals(parts[3]) ?Integer.valueOf(parts[3]):0,
                        parts[4],
                        !"".equals(parts[5]) ?Double.valueOf(parts[5]): 0,
                        !"".equals(parts[6]) ?Double.valueOf(parts[6]):0, 
                        !"".equals(parts[7]) ?Double.valueOf(parts[7]):0); 
                System.out.println(P);
                AllPyramids.add(P);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidsDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    return AllPyramids;

    
}
}

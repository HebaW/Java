/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CitiesAndCountries.Cities;
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
public class CitiesDaoImp implements CitiesCountriesDaoInterface<Cities> {

    @Override
    public List<Cities> getData(String path) {
        List <Cities> citieslist = new ArrayList<Cities>();
        
        File f = new File(path);
        try {
            Scanner sc = new Scanner(f);
            if (sc.hasNextLine()){
                sc.nextLine();
            }
            while (sc.hasNextLine()){
                String line = sc.nextLine();  
                if(line.isEmpty()){
                    System.out.println("Line is empty");
                    continue;
                }
                String arr [] = line.split(",");
                String iso3 = arr[0];
                String city_ascii = arr[1];
                double lat = "".equals(arr[2]) ? 0 :Double.valueOf(arr[2]);
                double lng = "".equals(arr[3]) ? 0 :Double.valueOf(arr[3]);
                boolean capital = "yes".equals(arr[4]);
                double population = "".equals(arr[5]) ? 0 : Double.valueOf(arr[5]);
                String id = arr[6];
                
                Cities c = new Cities ( iso3, city_ascii, lat, lng, capital, population,  id);
                citieslist.add(c); 
//                System.out.println(c);
                
            }          
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CitiesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return citieslist ;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CitiesAndCountries.Cities;
import CitiesAndCountries.Countries;
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
public class CountriesDaoImp implements CitiesCountriesDaoInterface<Countries> {

    @Override
    public List<Countries> getData(String path) {
        List <Countries> countrieslst = new ArrayList<Countries>();
        File f = new File(path);
        try {
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){ 
                String line = scan.nextLine();
                String [] part = line.split(",",-1);
                String country = part[0];
                String iso3 = part[1];
                
                Countries cn = new Countries(country, iso3);
                countrieslst.add(cn);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CountriesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         return countrieslst;

    }

}

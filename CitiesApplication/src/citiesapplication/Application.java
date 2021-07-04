/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citiesapplication;

import CitiesAndCountries.Cities;
import CitiesAndCountries.Countries;
import DAO.CitiesDaoImp;
import DAO.CountriesDaoImp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CitiesDaoImp c = new CitiesDaoImp();
//        c.getData("C:\\Users\\hp\\Documents\\cities2.csv");
        List<Cities> lst = c.getData("C:\\Users\\hp\\Downloads\\cities.csv");
        System.out.println(lst.get(400));
        
        CountriesDaoImp co = new CountriesDaoImp();
        List<Countries> l = co.getData("C:\\Users\\hp\\Downloads\\countries.csv");
        System.out.println(l.get(4));
        //for a specific country code git it's cities
        
        Map<String , List<Cities>> y = new HashMap();
        
        for (Countries countries : l) {
            List<Cities> list = new ArrayList<>();
            String code = countries.CountryCode();
            
            for (Cities cities : lst) {
                if (code.equals(cities.CountryCode())){
                    list.add(cities);
                    
                }
                
                
            }
            y.put(code, list);
            
        

        }
        
        System.out.println(y.get("DMA"));
        
        //sorting cities according to population
        lst.sort((a, b) -> {
            return (int)(a.getPopulation() - b.getPopulation()); 
        });
        
        lst.stream().forEach((t) -> { System.out.println(t.getIso3() +"\t\t"+ t.getPopulation());
        });
        
        
        //Lab ex3
        
        //highest population cities of each country
        
        Cities CityMax = lst.stream().filter((t) -> {
            return t.isCapital()   ; 
        }).max((o1, o2) -> {
            return (int)(o1.getPopulation() - o2.getPopulation()); 
        }).get();
        
        
        y.keySet().forEach((t) -> {
            System.out.println(y.get(t).stream().max((a, b) -> {
                return (int)(a.getPopulation()- b.getPopulation()); 
            }));
        });
        

//         Map<String,List<Cities>> Maxcity =lst.stream().sorted((a,b) ->{return (int) (a.getPopulation()-b.getPopulation());}).collect(Collectors.groupingBy(Cities::getIso3));
//	 System.out.println(Maxcity.values().toArray()[0]);

        
        
        }
       
        
        
                
                
        
    }
    

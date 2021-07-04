/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CitiesAndCountries.Cities;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public interface CitiesCountriesDaoInterface<type> {
    List<type> getData (String path);
    
}

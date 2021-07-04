/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitiesAndCountries;

/**
 *
 * @author hp
 */
public class Countries {

  
    private String country;
    private String iso3 ;

    public String CountryCode(){
        return iso3;
    };
    
    public String CountryName(){
        return country;
    }
    
    public Countries(String country, String iso3) {
        this.country = country;
        this.iso3 = iso3;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    
    @Override
    public String toString() {
        return "Countries{" + "country=" + country + ", iso3=" + iso3 + '}';
    }
    
    
    
}

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
public class Cities {
    private String iso3;
    private String city_ascii;
    private double lat;
    private double lng;
    private boolean capital;
    private double population;
    private String id;

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getCity_ascii() {
        return city_ascii;
    }

    public void setCity_ascii(String city_ascii) {
        this.city_ascii = city_ascii;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cities(String iso3, String city_ascii, double lat, double lng, boolean capital, double population, String id) {
        this.iso3 = iso3;
        this.city_ascii = city_ascii;
        this.lat = lat;
        this.lng = lng;
        this.capital = capital;
        this.population = population;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cities{" + "iso3=" + iso3 + ", city_ascii=" + city_ascii + ", lat=" + lat + ", lng=" + lng + ", capital=" + capital + ", population=" + population + ", id=" + id + '}';
    }

    public String CountryCode() {
       
        return iso3;
       
    }
    
    
   
    
    
}

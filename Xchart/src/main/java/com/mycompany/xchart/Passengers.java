/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xchart;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Passengers {
 
    public String pclass;
    public String survived;
    public String name;
    public String sex;
    public float age;
    public String sibsp;
    public String parch;
    public String ticket;
    public float fare;
    public String cabin;
    public String embarked;
    public String boat;
    public String body;
    public String home_dist;

    //Reading Json
    public List<Passengers> getPassengersFromJsonFile() throws FileNotFoundException, IOException {
        List<Passengers> allPassengers = new ArrayList<Passengers>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream input = new FileInputStream("C:\\Users\\hp\\Downloads\\titanic_csv.json");
        allPassengers = objectMapper.readValue(input, new TypeReference<List<Passengers>>() {
        });  
        return allPassengers;
    }

 

    public String getPclass() {
        return pclass;
    }

    public String getSurvived() {
        return survived;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float getAge() {
        return age;
    }

    public String getSibsp() {
        return sibsp;
    }

    public String getParch() {
        return parch;
    }

    public String getTicket() {
        return ticket;
    }

    public float getFare() {
        return fare;
    }

    public String getCabin() {
        return cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public String getBoat() {
        return boat;
    }

    public String getBody() {
        return body;
    }

    public String getHome_dist() {
        return home_dist;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xchart;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;


/**
 *
 * @author hp
 */
public class Xchart {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         Passengers P = new Passengers();
        List<Passengers> Passenger = new ArrayList<>();
        Passenger = P.getPassengersFromJsonFile();
        
        
        List<Float> pfare = Passenger.stream().map(Passengers::getFare).limit(8).collect(Collectors.toList());
        List<String> pName;
        pName = Passenger.stream().map(Passengers::getName).limit(8).collect(Collectors.toList());

        //create chart//
        CategoryChart chart1 = new CategoryChartBuilder().width(1024).height(768).title("Fare Hist").xAxisTitle("Names").yAxisTitle("Fare").build();
        //customize chart (style)
        chart1.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart1.getStyler().setHasAnnotations(true);  //numbers inside blocks//
        
        //adding the sets to chart
        chart1.addSeries("Passenger's fare", pName, pfare);   //(Word inside Legends, x , y) //
        //Display//
        new SwingWrapper(chart1).displayChart();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //age and name of all passengers as a set of data//
        List<Float> pAges = Passenger.stream().map(Passengers::getAge).limit(8).collect(Collectors.toList());
        List<String> pNames = Passenger.stream().map(Passengers::getName).limit(8).collect(Collectors.toList());

        //create chart "Histogram"//
        CategoryChart chart = new CategoryChartBuilder().width(1024).height(768).title("Age Hist").xAxisTitle("Names").yAxisTitle("Age").build();
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);  
        
        chart.addSeries("Passenger's Ages", pNames, pAges);  
        //Displaying Histogram//
        new SwingWrapper(chart).displayChart();

        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        PieChart pieChart = new PieChartBuilder().width(1024).height(768).title("Passenger's Classes").build();
        PieChart pchart = new PieChartBuilder().width(1024).height(768).title("Percentage of Passenger in every class").build();
        Color[] sliceColors = new Color[]{new Color(180, 68, 50), new Color(130, 105, 120), new Color(80, 143, 160)};
        pchart.getStyler().setSeriesColors(sliceColors);
        //adding sets to chart//
        Map<String, Long> result = Passenger.stream().collect(Collectors.groupingBy(Passengers::getPclass, Collectors.counting()));
        pchart.addSeries("First Class", result.get("1"));
        pchart.addSeries("Second Class", result.get("2"));
        pchart.addSeries("Third Class", result.get("3"));
        
        new SwingWrapper(pchart).displayChart();
        
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
        PieChart pchart2 = new PieChartBuilder().title("Percentage of Gender Survived").build();
        Map<String,Long> SurvivedGender = Passenger.stream().filter((name) -> name.getSurvived().equals("1")).collect(Collectors.groupingBy(Passengers::getSex,Collectors.counting()));
        Color[] Colors = new Color[]{new Color(180, 68, 50), new Color(130, 105, 120)};
        pchart2.getStyler().setSeriesColors(Colors);
    
        pchart2.addSeries("Female", SurvivedGender.get("female"));
        pchart2.addSeries("Male", SurvivedGender.get("male"));
        
        new SwingWrapper(pchart2).displayChart();
    }
  }

    


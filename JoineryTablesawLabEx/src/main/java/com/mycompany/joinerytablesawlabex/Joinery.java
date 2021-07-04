/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinerytablesawlabex;

import java.io.IOException;
import joinery.DataFrame;

/**
 *
 * @author hp
 */
public class Joinery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        try{ 
            DataFrame<Object> df = DataFrame.readCsv("C:\\Users\\hp\\Downloads\\Java-Uml-Programming-Course-main\\Day3\\MavenExcercise\\pom.xml\\src\\main\\resources\\Data\\titanic.csv");
            System.out.println(df.toString());
            System.out.println ("=========================================================================================");

            
            DataFrame<Object> dff = DataFrame.readCsv("C:\\Users\\hp\\Downloads\\Java-Uml-Programming-Course-main\\Day3\\MavenExcercise\\pom.xml\\src\\main\\resources\\Data\\titanic.csv")
                .retain("pclass","survived","name","sex","age",	"sibsp","parch","ticket","fare","cabin","embarked","boat","body","home.dest")
                .groupBy(row ->row.indexOf("age")).min();
           System.out.println("Minimum age :");
           dff.iterrows().forEachRemaining(System.out::println);
           System.out.println ("=========================================================================================");
           
           
            DataFrame<Object> dfff = DataFrame.readCsv("C:\\Users\\hp\\Downloads\\Java-Uml-Programming-Course-main\\Day3\\MavenExcercise\\pom.xml\\src\\main\\resources\\Data\\titanic.csv")
                .retain("pclass","survived","name","sex","age",	"sibsp","parch","ticket","fare","cabin","embarked","boat","body","home.dest")
                .groupBy(row ->row.indexOf("age")).max();
           System.out.println("Maximum age : ");
           dfff.iterrows().forEachRemaining(System.out::println);
           System.out.println ("=========================================================================================");
       
          
           DataFrame<Object> dffff= DataFrame.readCsv("C:\\Users\\hp\\Downloads\\Java-Uml-Programming-Course-main\\Day3\\MavenExcercise\\pom.xml\\src\\main\\resources\\Data\\titanic.csv")
                .retain("pclass","survived","name","sex","age",	"sibsp","parch","ticket","fare","cabin","embarked","boat","body","home.dest")
                .stddev();
           System.out.println("The standard deviation is : ");
           dffff.iterrows().forEachRemaining(System.out::println);
           System.out.println ("=========================================================================================");
           
          
           DataFrame<Object> dfjoin = dff.join(dfff);
           System.out.println("Joining dff (Minimum age) with dfff (Maximum age)");
           dfjoin.iterrows().forEachRemaining(System.out::println);
           System.out.println ("=========================================================================================");
           
           
           
           DataFrame<Object> dfmerge= dff.merge(dfff);
           System.out.println("Merging dff (Minimum age) with dfff (Maximum age)");
           dfmerge.iterrows().forEachRemaining(System.out::println);
           System.out.println ("=========================================================================================");
           
           
           DataFrame<Object> dfAddColoumn= dff.add("Extra Coloumn");
           System.out.println("Adding column to dff ( Minimum age) ,value = null");
           dfAddColoumn.iterrows().forEachRemaining(System.out::println);
           System.out.println ("=========================================================================================");
          
        }
        
        catch (IOException e) {
	        }
    
}
}

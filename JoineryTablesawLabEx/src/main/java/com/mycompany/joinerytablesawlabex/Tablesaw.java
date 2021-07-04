/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinerytablesawlabex;

import java.io.IOException;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;

/**
 *
 * @author hp
 */
public class Tablesaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //read csv file first
            Table titanipassenger = Table.read().csv("C:\\Users\\hp\\Downloads\\Java-Uml-Programming-Course-main\\Day3\\MavenExcercise\\pom.xml\\src\\main\\resources\\Data\\titanic.csv"); 
            DoubleColumn New = DoubleColumn.create("New Coloumn");
            
            Table summary = titanipassenger.summary();

            for (int i=0; i<titanipassenger.rowCount(); i++)
            {   New.append(i);
            }
              System.out.println(New);
              
              titanipassenger.addColumns(New);
              System.out.println(titanipassenger);
              System.out.println(summary.row(2)); 
              System.out.println(summary.row(4));
              System.out.println(summary.row(6));
    
    }
    
}

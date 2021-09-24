/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author Enaitz Izagirre
 */
public class FichModelImplementation implements Model{

    private ResourceBundle configFile;
    private String greeting;
    
    @Override
    public String getGreeting() {    
       configFile = ResourceBundle.getBundle("properties.fich");
       greeting = configFile.getString("Saludo");
         return greeting;
    }
    
    
    
  

   
    
}

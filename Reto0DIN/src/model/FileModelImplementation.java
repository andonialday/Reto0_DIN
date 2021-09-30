/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;


/**
 * This class implements the model interface to take the getGreeting Method.
 * Its one of the 2 classes who is called by the Model Factory
 * It is connected to a File
 * @author Enaitz Izagirre
 */
public class FileModelImplementation implements Model{

    private ResourceBundle configFile;
    private String greeting;
    
     /**
     * This method gets the greeting from the File to return it 
     * @return Returns the String Greeting from the File
     */
    @Override
    public String getGreeting() {    
       configFile = ResourceBundle.getBundle("properties.file");
       greeting = configFile.getString("Saludo");
         return greeting;
    }
    
    
    
  

   
    
}

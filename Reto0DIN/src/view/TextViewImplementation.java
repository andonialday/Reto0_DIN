/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 *
 * @author Andoni Alday
 */
public class TextViewImplementation implements View{
    
    @Override
    public void showGreeting(String greeting){  
        System.out.println(greeting);      
    }  
}

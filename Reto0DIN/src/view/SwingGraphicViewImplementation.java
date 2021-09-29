/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 * Implementation of the View Interface. This Implementation uses the JavaSwing
 * sources to show the greeting to the user
 * @author Andoni Alday
 */
public class SwingGraphicViewImplementation implements View{

    /**
     * Method to show the greeting to the user via Swing
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        JOptionPane.showMessageDialog(null, greeting);       
    }
    
    
    
}

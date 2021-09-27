/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Andoni Alday
 */
public class SwingGraphicViewImplementation implements View{

    @Override
    public void showGreeting(String greeting) {
        JOptionPane.showMessageDialog(null, greeting);       
    }
    
    
    
}

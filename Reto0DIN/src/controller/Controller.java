/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exception.ConnectException;
import exception.ReadException;
import model.Model;
import view.View;

/**
 * This class is call by the main .
 * Here we have the method Run .
 * @author Enaitz Izagirre
 */
public class Controller {
    
    /**
     * 
     * @param view 
     * @param model
     * @throws ReadException
     * @throws ConnectException 
     * In this method we take both the view and the model to show the greeting to the user.
     */
    public void run(View view, Model model) throws ReadException, ConnectException{
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
    
}

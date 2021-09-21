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
 * In this method we take both the view and the model to show the user the greeting
 * @author Enaitz Izagirre
 */
public class Controller {

    private String greeting;
    
    public Controller(View view, Model model) throws ReadException, ConnectException {
        greeting = model.getGreeting();
        view.showGreeting(greeting);
        
    
    }
    
}

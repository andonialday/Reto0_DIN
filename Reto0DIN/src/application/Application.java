/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import exception.*;
import model.Model;
import model.ModelFactory;
import view.View;
import view.ViewFactory;

/**
 *
 * @author Andoni Alday
 */
public class Application {

    /**
     * @param args the command line arguments
     * @throws exception.ReadException
     * @throws exception.ConnectException
     */
    public static void main(String[] args) throws ReadException, ConnectException {
        // TODO code application logic here
        ViewFactory viewFactory = new ViewFactory();
        ModelFactory modelFactory = new ModelFactory();
        View view = viewFactory.getView();
        Model model = modelFactory.getModel();
        Controller control = new Controller();
        control.run(view, model);
    }
    
}

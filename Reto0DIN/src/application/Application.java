/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import model.Model;
import model.ModelFactory;
import view.View;
import view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewFactory viewFactory = new ViewFactory();
        ModelFactory modelFactory = new ModelFactory();
        View view = viewFactory.getView();
        Model model = modelFactory.getModel();
        Controller control = new Controller(view, model);
    }
    
}

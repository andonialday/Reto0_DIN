/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * This class defines which implementation of View is used based on the
 * view.properties configuration file
 * @author Andoni Alday
 */
public class ViewFactory {

    private String type = ResourceBundle.getBundle("properties.view").getString("View_Type");
    final private String FX = "JavaFX";
    final private String SWING = "Swing";
    final private String TEXT = "Text";

    /**
     * Method to obtain a view of the Implemented type chosen in the
     * view.properties file
     *
     * @return View ready to be used by the controller
     */
    public View getView() {
        View view = null;
        switch (type) {
            case FX: {
                view = new JavaFXGraphicViewImplementation();
            };
            break;
            case SWING: {
                view = new SwingGraphicViewImplementation();
            };
            break;
            case TEXT: {
                view = new TextViewImplementation();
            };
            break;
            default: {    
            }
        } 
        return view;
        }
}

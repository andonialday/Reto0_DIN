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
public class ViewFactory {

    private ResourceBundle configFile = ResourceBundle.getBundle("properties.view");
    private String type = configFile.getString("View_Type");

    public ViewFactory() { 
    }

    public View getView() {
        View view = null;
        switch (type) {
            case "JavaFX": {
                view = new JavaFXGraphicViewImplementation();
            };
            case "Swing": {
                view = new SwingGraphicViewImplementation();
            };
            case "Text": {
                view = new TextViewImplementation();
            };
            default: {    
            }
        } 
        return view;
        }
}

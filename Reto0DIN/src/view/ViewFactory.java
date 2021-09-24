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

    private String type = ResourceBundle.getBundle("properties.view").getString("View_Type");
    final private String FX = "JavaFX";
    final private String SWING = "Swing";
    final private String TEXT = "Text";

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

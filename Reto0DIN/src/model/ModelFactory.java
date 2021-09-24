/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author Enaitz Izagirre
 */
public class ModelFactory {

    private ResourceBundle configFile = ResourceBundle.getBundle("properties.model");
    private String type = configFile.getString("Model_Type");

    public ModelFactory() {  
    }

    public Model getModel() {
        Model model = null;
        switch (type) {
            case "BBDD": {
                model = new BdaModelImplementation();
            }
            ;
            case "File": {
                model = new FichModelImplementation();
            }
            ;
            default: {
            }
        }
        return model;
    }
}

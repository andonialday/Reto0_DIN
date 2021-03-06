/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * This class defines which implementation of Model is used based on the
 * model.properties configuration file
 *
 * @author Enaitz Izagirre
 */
public class ModelFactory {

    private String type = ResourceBundle.getBundle("properties.model").getString("Model_Type");
    final private String DB = "BBDD";
    final private String FILE = "File";

    /**
     * Method to obtain a model of the Implemented type chosen in the
     * model.properties file
     *
     * @return Model ready to be used by the controller
     */
    public Model getModel() {
        Model model = null;
        switch (type) {
            case DB: {
                model = new DDBBModelImplementation();
            }
            break;
            case FILE: {
                model = new FileModelImplementation();
            }
            break;
            default: {
            }
        }
        return model;
    }
}

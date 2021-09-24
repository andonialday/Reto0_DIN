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

    private String type = ResourceBundle.getBundle("properties.model").getString("Model_Type");
    final private String DB = "BBDD";
    final private String FILE = "File";

    public Model getModel() {
        Model model = null;
        switch (type) {
            case DB: {
                model = new BdaModelImplementation();
            }
            break;
            case FILE: {
                model = new FichModelImplementation();
            }
            break;
            default: {
            }
        }
        return model;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.*;

/**
 * This interface dictates the requisites of the BdaModelImplementation class
 * and the FichModelImplementation class
 *
 * @author Enaitz Izagirre
 */
public interface Model {

    /**
     * Method to obtain the greeting asked by the controller
     *
     * @return String to be delivered to the Controller
     * @throws ReadException if failing to read from the DDBB 
     * @throws ConnectException if failing to connect to the DDBB 
     */
    public String getGreeting() throws ReadException, ConnectException;

}

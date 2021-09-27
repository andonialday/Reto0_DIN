/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.*;

/**
 * This interface dictates the requisites of the BdaModelImplementation class and the FichModelImplementation class
 * @author Enaitz Izagirre
 */
public interface Model {
  
    public String getGreeting() throws ReadException, ConnectException;

}

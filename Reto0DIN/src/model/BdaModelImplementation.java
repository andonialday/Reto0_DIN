/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import properties.ConnectionOpenClose;

/**
 *
 * @author Enaitz Izagirre
 */
public class BdaModelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose conection = new ConnectionOpenClose();

    @Override
    public String getGreeting() throws CreateException, ConnectException{

        try {
            con = conection.openConnection();
        } catch (ConnectException e) {
            throw new ConnectException(e.getMessage());
        }

        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * This class implements the model interface to take the getGreeting Method. Its
 * one of the 2 classes called by the Model Factory, connected to the DDBB
 *
 * @author Enaitz Izagirre
 */
public class BdaModelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose conection = new ConnectionOpenClose();
    private String greeting;
    private final String readGreeting = "SELECT Greeting FROM greetings";

    /**
     * This method get the greeting from the DDBB to return it
     *
     * @return Returns the String Greeting from the BDA
     * @throws ReadException if failing to read from the DDBB
     * @throws ConnectException if failing to connect to the DDBB
     */
    @Override
    public String getGreeting() throws ReadException, ConnectException {
        ResultSet rs = null;
        try {
            con = conection.openConnection();
        } catch (ConnectException e) {
            throw new ConnectException(e.getMessage());
        }

        try {
            stmt = con.prepareStatement(readGreeting);
            rs = stmt.executeQuery();
            while (rs.next()) {
                greeting = rs.getString("greeting");
            }

        } catch (Exception e) {
            throw new ReadException("Error al Leer");
        }
        try {
            conection.closeConnection(stmt, con);
        } catch (ConnectException e) {
            throw new ConnectException(e.getMessage());
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                throw new ReadException("Error al Leer");
            }
        }
        return greeting;
    }

}

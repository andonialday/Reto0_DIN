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
import properties.ConnectionOpenClose;

/**
 *
 * @author Enaitz Izagirre
 */
public class BdaModelImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose conection = new ConnectionOpenClose();
    private String greeting;
    private final String readGreeting = "SELECT Greeting FROM greetings";

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

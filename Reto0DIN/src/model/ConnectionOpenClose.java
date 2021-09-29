package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import exception.*;

/**
 * Method designed to control the connection with the DDBB
 * @author Andoni Alday
 */
public class ConnectionOpenClose {
	
	private ResourceBundle configFile;
	private String url, user,  pass;
	
    /**
     * Method designed to connect to the DDBB
     */
    public ConnectionOpenClose() {
		configFile = ResourceBundle.getBundle("properties.config");
		url = configFile.getString("URL");
		user = configFile.getString("USER");
		pass = configFile.getString("PASSWORD");
	}

    /**
     * Method for connecting with the DDBB
     * @return the connection object for use by other methods
     * @throws ConnectException if the connection fails
     */
    public Connection openConnection() throws ConnectException {

		Connection con= null;
		
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			throw new ConnectException("Error al intentar Conectar con la BD");
		}
		return con;
	}

    /**
     * Methor designed for disconnecting from the DDBB
     * @param stmt the last used SQL sequence
     * @param con the previously established connection 
     * @throws ConnectException if the disconnection fails
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws ConnectException {

		if (stmt != null || con != null) {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				throw new ConnectException("Error al intentar Desconectar con la BD");
			}
		}
	}

}

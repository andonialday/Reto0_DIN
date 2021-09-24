package properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import exception.ConnectException;

public class ConnectionOpenClose {
	
	private ResourceBundle configFile;
	private String url, user,  pass;
	

	public ConnectionOpenClose() {
		configFile = ResourceBundle.getBundle("properties.config");
		url = configFile.getString("URL");
		user = configFile.getString("USER");
		pass = configFile.getString("PASSWORD");
	}

	public Connection openConnection() throws ConnectException {

		Connection con= null;
		
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			throw new ConnectException("Error al intentar Conectar con la BD");
		}
		return con;
	}

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

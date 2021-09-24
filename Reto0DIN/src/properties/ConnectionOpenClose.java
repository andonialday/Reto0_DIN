package properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import exception.ConnectException;

public class ConnectionOpenClose {
	
	private String url, user,  pass;
	
	public ConnectionOpenClose() {
		url = ResourceBundle.getBundle("properties.config").getString("URL");
		user = ResourceBundle.getBundle("properties.config").getString("USER");
		pass = ResourceBundle.getBundle("properties.config").getString("PASSWORD");
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

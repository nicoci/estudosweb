package br.com.estudosweb.estudosweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/estudosweb","postgres","inline01");
		} catch (SQLException e) {
			//relançando a exception
			throw new RuntimeException(e);
			
		}
		
	}

}

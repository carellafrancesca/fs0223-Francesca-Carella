package com.esercizio2_W3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	
	String url = "jdbc:postgresql://localhost:5432/";
    String dbName = "esercizio2w3";
    String user = "postgres";
    String pass = "root";
    Statement st;
	
    public DbConnection() throws SQLException {
		Connection connect = DriverManager.getConnection(url+dbName, user, pass);
		st = connect.createStatement();
		createTableStudenti();
		System.out.println("Database Connected!");
	}
    
    public void createTableStudenti() throws SQLException {
		String sql =  " CREATE TABLE IF NOT EXISTS studenti ("
					+ "		id SERIAL,"
					+ " 	name VARCHAR NOT NULL,"
					+ "		lastname VARCHAR NOT NULL,"
					+ "     gender VARCHAR NOT NULL,"
					+ "     birthdate DATE NOT NULL,"
					+ "     avg DECIMAL NOT NULL,"
					+ "     min_vote DECIMAL NOT NULL,"
					+ "     max_vote DECIMAL NOT NULL"
					+ " );" ;
		st.executeUpdate(sql);
		System.out.println("Table Studenti Created!");
	}
    
    public void inserisciStudente(Studente s) throws SQLException {
		String sql = " INSERT INTO studenti (nome, lastname, gender, birthdate, avg, min_vote, max_vote) "
				   + "VALUES ('"+s.getName()+"', '"+s.getLastname()+"', '"
				   + s.getGender()+"', '"+s.getBirthdate()+"', '"+s.getAvg()+"', '"+s.getMin_vote()+"', '"+s.getMax_vote()+"', );";
		st.executeUpdate(sql);
		System.out.println(s.getName() + " " + s.getLastname() + " ADDED!");
	}
    
    
    
    
}

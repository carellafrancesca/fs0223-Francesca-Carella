package com.esercizio2_W3;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainProject {

	public static void main(String[] args) {

		try {
			DbConnection db = new DbConnection();
			
			Studente Francesca = new Studente ("Francesca", "Carella", Gender.FEMALE, LocalDate.of(2000,03,29), 7.8, 6.8, 7.9);
			Studente Giuseppe = new Studente ("Giuseppe", "Verdi", Gender.MALE, LocalDate.of(1998,06,15), 6.5, 5.7, 7.1);
			db.inserisciStudente(Francesca);
			db.inserisciStudente(Giuseppe);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

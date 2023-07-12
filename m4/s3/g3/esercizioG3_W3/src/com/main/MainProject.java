package com.main;

import java.sql.SQLException;
import java.time.LocalDate;
import com.classi.Evento;
import com.classi.EventoDAO;
import com.enums.tipoEvento;

public class MainProject {

	public static void main(String[] args) {
		
		Evento evento = new Evento("Concerto", LocalDate.of(2023, 07, 15), "Arctic Monkeys", tipoEvento.PUBBLICO, 60000);
		Evento evento2 = new Evento("Concerto", LocalDate.of(2024, 07, 14), "Taylor Swift", tipoEvento.PUBBLICO, 70000);
		Evento evento3 = new Evento("Concerto", LocalDate.of(2023, 06, 26), "Coldplay", tipoEvento.PUBBLICO, 80000);
		
		try {
			EventoDAO eventodao = new EventoDAO();
			eventodao.salvaEvento(evento);
			eventodao.salvaEvento(evento2);
			eventodao.salvaEvento(evento3);
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

}

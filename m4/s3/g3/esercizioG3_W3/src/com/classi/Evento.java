package com.classi;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.enums.tipoEvento;

@Entity
@Table(name = "events")

public class Evento {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
    @Column(name = "titolo", nullable = false)
     private String titolo;
    @Column(name = "dataEvento", nullable = false)
     private LocalDate eventDate;
    @Column(name = "descrizione", nullable = false)
     private String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "privacy")
     private tipoEvento eventType;
    @Column(name = "partecipanti", nullable = false)
     private int partecipanti;

    public Evento() {
        super();
    }

	public Evento(String titolo, LocalDate eventDate, String descrizione, tipoEvento eventType, int partecipanti) {
		super();
		this.titolo = titolo;
		this.eventDate = eventDate;
		this.descrizione = descrizione;
		this.eventType = eventType;
		this.partecipanti = partecipanti;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public tipoEvento getEventType() {
		return eventType;
	}

	public void setEventType(tipoEvento eventType) {
		this.eventType = eventType;
	}

	public int getPartecipanti() {
		return partecipanti;
	}

	public void setPartecipanti(int partecipanti) {
		this.partecipanti = partecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id 
				+ ", titolo=" + titolo 
				+ ", eventDate=" + eventDate 
				+ ", descrizione=" + descrizione
				+ ", eventType=" + eventType 
				+ ", partecipanti=" + partecipanti + "]";
	}

	
}

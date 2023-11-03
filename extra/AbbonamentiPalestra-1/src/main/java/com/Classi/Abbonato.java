package com.Classi;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Persone_Abbonate")
public class Abbonato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nomeIscritto;
	@Column(nullable = false)
	private String cognomeIscritto;
	@Column(nullable = false)
	private String cittaNascita;
	@Temporal(TemporalType.DATE)
	private LocalDate dataNascita;
	
}

package com.AbbonamentiPalestra.Class;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Abbonamenti")
public class Abbonamenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, columnDefinition = "DATE")
	protected LocalDate dataDiIscrizione;
	@Column(nullable = false, columnDefinition = "DATE")
	protected LocalDate dataDiScadenza;
	
	@Enumerated(EnumType.STRING)
    private TipoAttivita attivita;
	
	@Enumerated(EnumType.STRING)
    private TipoAbbonamento tipo;
	
	public double getPrezzo() {
	   return tipo.getPrezzo();
	}
	
    @OneToOne
    @JoinColumn(name = "abbonato_id")
    private Abbonati abbonato;
	
}

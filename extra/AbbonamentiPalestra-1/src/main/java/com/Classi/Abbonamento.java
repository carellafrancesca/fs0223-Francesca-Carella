package com.Classi;

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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Abbonamenti")
public class Abbonamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private LocalDate rilascioAbbonamento;
	@Temporal(TemporalType.DATE)
	private LocalDate dataScadenza;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_abbonamento")
	private TipologieAbbonamento tipo;
	
	public double getPrezzo() {
        return tipo.getPrezzo();
    }
	
    @OneToOne
    @JoinColumn(name = "id_abbonato")
    private Abbonato abbonato;
	
}

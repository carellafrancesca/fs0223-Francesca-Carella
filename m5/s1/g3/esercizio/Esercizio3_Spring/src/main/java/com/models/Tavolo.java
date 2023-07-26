package com.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Tavolo {

	private Integer numero;
	private Integer numeroMassimoCoperti;
	private Boolean occupato = false;
	
	public void setOccupato(Boolean occupato) {
		this.occupato = occupato;
	}
	
}

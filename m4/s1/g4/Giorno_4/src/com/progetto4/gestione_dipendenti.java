package com.progetto4;

public class gestione_dipendenti {

	public static void main(String[] args) {
	
		classe_dipendente Francesca = new classe_dipendente("15", Dipartimento.VENDITE);
		System.out.println(Francesca.getMatricola());
		Francesca.stampaDatiDipendente();
		Francesca.Promuovi();
		System.out.print(classe_dipendente.calcolaPaga(Francesca, 10));
		
		classe_dipendente Mattia = new classe_dipendente ("16", Dipartimento.AMMINISTRAZIONE);
		classe_dipendente Valeria = new classe_dipendente ("17", Dipartimento.PRODUZIONE);
		classe_dipendente Giuseppe = new classe_dipendente ("18", Dipartimento.PRODUZIONE);
		classe_dipendente Sara = new classe_dipendente ("17", Dipartimento.VENDITE);
		
		Mattia.Promuovi();
		Valeria.Promuovi();
		Valeria.Promuovi();
		Giuseppe.Promuovi();
		Sara.Promuovi();
		Sara.Promuovi();
		Mattia.stampaDatiDipendente();
		Valeria.stampaDatiDipendente();
		Giuseppe.stampaDatiDipendente();
		Sara.stampaDatiDipendente();	
		
		pagaTotale(Mattia, Valeria, Giuseppe, Sara);
	}

	public static void pagaTotale(classe_dipendente d1, classe_dipendente d2, classe_dipendente d3, classe_dipendente d4) {
		System.out.println(
			classe_dipendente.calcolaPaga(d1, 5) +
			classe_dipendente.calcolaPaga(d2, 5) +
			classe_dipendente.calcolaPaga(d3, 5) +
			classe_dipendente.calcolaPaga(d4, 5) );
	}
	
}

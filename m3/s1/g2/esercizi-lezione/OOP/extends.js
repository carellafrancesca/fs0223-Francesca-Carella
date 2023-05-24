"use strict";
class Pizza {
    constructor(_gusto, _prezzo) {
        this.formati = ['Normale', 'Mini', 'Mezzo Metro'];
        this.gusto = _gusto;
        this.prezzo = _prezzo;
    }
    informazioni() {
        console.log(`Gusto:${this.gusto}, Prezzo:${this.prezzo}$`);
    }
}
let margherita = new Pizza('Margherita', 5);
//console.log(margherita.prezzo);
margherita.informazioni();
class PizzaSpeciale extends Pizza {
    constructor(_gusto, _prezzo, _altezzaCornicione) {
        super(_gusto, _prezzo);
        this.altezzaCornicione = _altezzaCornicione;
    }
    mostraFormati() {
        console.log(this.formati); //errore poiché la prop formati è private e appartiene alla super classe
    }
    informazioni() {
        let datoSuperClasse = super.informazioni();
        return `${datoSuperClasse}, Altezza Cornicione: ${this.altezzaCornicione}`;
    }
}
let diavola = new PizzaSpeciale('Diavola', 1, 5);
console.log(diavola);
console.log(diavola.informazioni());
diavola.mostraFormati();

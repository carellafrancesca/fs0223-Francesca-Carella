//CLASSE
var Capo = /** @class */ (function () {
    function Capo(id, codprod, collezione, capo, modello, quantità, colore, prezzoivaesclusa, prezzoivainclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantità = quantità;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
        this.mostraPrezzo();
    }
    Capo.prototype.mostraPrezzo = function () {
        console.log('Prodotto: ' + this.capo);
        console.log('Prezzo con Iva ' + this.prezzoivainclusa + '$');
    };
    return Capo;
}());
//FETCH
fetch("Abbigliamento.json")
    .then(function (res) {
    if (res.ok) {
        return res.json();
    }
    else {
        throw new Error("Errore");
    }
})
    .then(function (data) {
    var arr = [];
    data.forEach(function (element) {
        var capoAbbigliamento = new Capo(element.id, element.codprod, element.collezione, element.capo, element.modello, element.quantità, element.colore, element.prezzoivaesclusa, element.prezzoivainclusa, element.disponibile, element.saldo);
        arr.push(capoAbbigliamento);
    });
    console.log(arr);
})
    .catch(function (err) {
    console.log(err);
});

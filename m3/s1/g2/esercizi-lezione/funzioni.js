"use strict";
//funzioni assegnate ad una variabile
var _a;
const prova = function () {
    console.log('test');
};
prova();
//funzioni classiche
function funzioneProva() {
    return 'stringa restituita';
}
funzioneProva();
//funzioni parametriche
function creaHTMLBold(testo) {
    //va a scrivere in bold il testo in ingresso
}
function $(selettore) {
    return document.querySelector(selettore);
}
(_a = $('#test')) === null || _a === void 0 ? void 0 : _a.style.color; // ? = interrompe la lettura dell'oggetto qualora fosse null, come se fosse uno stop prima di procedere
/*let test = $('#test');
    if(test){
        test.style.color
    }
------- alternativa alla riga 27*/
//funzioni freccia
let test1 = () => 'ciao';
let test2 = () => {
    console.log('prova void');
};
let moltiplica = (a) => a * 2;
//parametri facoltativi
function somma(a, b, c) {
    if (!c)
        c = 0; //gestisco la mancanza di c per spegnere l'errore in ts
    return a + b + c;
}

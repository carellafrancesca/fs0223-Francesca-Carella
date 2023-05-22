"use strict";
let stringaSporca = 'testo';
console.log(stringaSporca);
console.log(stringaSporca.trim());
console.log(stringaSporca.trim());
console.log(Math.abs(-45));
let now = new Date();
console.log(`Siamo è il mese numero ${now.getMonth() + 1}`);
console.log('Hello world');
let nome = 'Mario';
let anni = 30;
let boolean = false;
let array = [true, 30, 'testo']; //any: array misto, qualsiasi tipo di dato
let arrayString = ['stringa'];
let arrayNumber = [30, 15, 24];
nome = 'Marco';
let vuota;
vuota = 0;
//tipizzazione oggetti
let user = {
    nome: 'Mario'
};
console.log(user.nome);
//let element:HTMLInputElement | null = document.querySelector('#test')
//tipizzazione funzioni
let salutoVar = () => {
    console.log('Ciao!');
};
function saluto() {
    console.log('Ciao');
}
saluto();
function restituisciSaluto() {
    return 'Ciao!';
}
function somma(a, b) {
    return a + b;
}
somma(0, 5);

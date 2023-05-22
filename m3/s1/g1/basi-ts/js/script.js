console.log('Hello world');
var nome = 'Mario';
var anni = 30;
var boolean = false;
var array = [true, 30, 'testo']; //any: array misto, qualsiasi tipo di dato
var arrayString = ['stringa'];
var arrayNumber = [30, 15, 24];
nome = 'Marco';
var vuota;
vuota = 0;
//tipizzazione oggetti
var user = {
    nome: 'Mario'
};
console.log(user.nome);
//let element:HTMLInputElement | null = document.querySelector('#test')
//tipizzazione funzioni
var salutoVar = function () {
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

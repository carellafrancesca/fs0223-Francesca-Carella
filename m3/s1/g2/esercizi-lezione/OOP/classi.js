"use strict";
class User {
    constructor(_nome, _cognome, _anni, _password) {
        this.nome = _nome;
        this.cognome = _cognome;
        this.anni = _anni;
        this.password = _password;
    }
    presentazione() {
        console.log(`Ciao, mi chiamo ${this.nome} ${this.cognome} ed ho ${this.anni}anni`);
    }
}
let user1 = new User('Mario', 'Rossi', 30);
let user2 = new User('Maria', 'Bianchi', 35, 'jncfndcjwbe');
console.log(user2);
console.log(user2.nome);
//console.log(user2.password); - errore

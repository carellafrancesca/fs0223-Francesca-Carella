"use strict";
{
    //modalità js
    let user = {
        nome: 'mario',
        cognome: 'rossi'
    };
    console.log(user.nome);
    //modalità ts
    let userTipizzato = {
        nome: 'mario',
        cognome: 'rossi'
    };
    //anni è una proprietà facoltativa
    //quando si lavora con gli oggetti ts vuole avere certezza della forma di ogni oggetto
}
{
    class User {
        constructor(_nome, _cognome, _anni) {
            this.nome = _nome;
            this.cognome = _cognome;
            this.anni = _anni;
        }
    }
    //posso creare un oggetto a mano
    let userTipizzato = {
        nome: 'mario',
        cognome: 'rossi'
    };
    //posso instanziare una classe
    let userTipizzato2 = new User('Maria', 'Bianchi');
}

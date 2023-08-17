import { Injectable, OnInit } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceTestService{

  utenti = [
    {nome: "Francesca", cognome: "Carella"},
    {nome: "Valeria", cognome: "Rossi"},
    {nome: "Giuseppe", cognome: "Neri"},
    {nome: "Leonardo", cognome:"Qwerty"},
    {nome: "Anna", cognome:"Verdi"}
  ]

  constructor(){ }

  getUtenti(){
    return this.utenti
  }

  getUtente(index: number){
    return this.utenti[index];
  }

}

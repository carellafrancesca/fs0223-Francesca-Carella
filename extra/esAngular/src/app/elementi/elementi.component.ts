import { Component } from '@angular/core';

@Component({
  selector: 'app-elementi',
  templateUrl: './elementi.component.html',
  styleUrls: ['./elementi.component.scss']
})
export class ElementiComponent {
  title = 'Username';
  isVisible = true;

  persone = [
    {nome: "Mario", cognome: "Rossi", isOnline: true},
    {nome: "Giuseppe", cognome: "Verdi", isOnline: true},
    {nome: "Anna", cognome: "Neri", isOnline: false},
    {nome: "Sara", cognome: "Rosa", isOnline: false},
    {nome: "Marco", cognome: "Grigi", isOnline: true}
  ]

  onClick(event: Event){
    this.title = "Ho cliccato sul bottone."
  };

  onInput(event: Event){
    console.log( (<HTMLInputElement>event.target).value )
  };


}

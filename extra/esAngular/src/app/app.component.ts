import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'esAngular';
  isVisible = true;

  onClick(event: Event){
    this.title = "Ho cliccato sul bottone."
  };

  onInput(event: Event){
    console.log( (<HTMLInputElement>event.target).value )
  };



}

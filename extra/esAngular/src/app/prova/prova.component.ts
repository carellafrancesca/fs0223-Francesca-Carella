import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, ElementRef, Input, OnDestroy, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-prova',
  templateUrl: './prova.component.html',
  styleUrls: ['./prova.component.scss']
})
export class ProvaComponent implements OnInit, AfterViewInit{

  @ViewChild('inputSaluti') inputSaluti!: ElementRef<HTMLInputElement>// Anche :any va bene, ma è troppo generico

  numero = 15;

  constructor(){
    console.log("Costruttore");
  }

  ngOnInit(): void {
    console.log("ngOnInit");
    console.log(this.inputSaluti);
  }

  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
    console.log(this.inputSaluti);
  }

  onClick(){
    console.log(this.inputSaluti.nativeElement.value);
  }

}

import { Component, OnInit } from '@angular/core';
import { ServiceTestService } from './direttive/service-test.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'esAngular';

  constructor(private testProva: ServiceTestService){}

  ngOnInit(): void {
    console.log("appcomponent", this.testProva.utenti)
  }

}

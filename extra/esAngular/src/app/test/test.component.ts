import { Component, Input, OnInit } from '@angular/core';
import { ServiceTestService } from '../direttive/service-test.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.scss']
})
export class TestComponent implements OnInit{

  utenti: any;
  utente: any;
  //isProfile: boolean;

  constructor(private testProva: ServiceTestService, private route: ActivatedRoute){}

  /*ngOnInit(): void {
   console.log(this.testProva.utenti)
  }*/

  ngOnInit(): void {
    this.utenti = this.testProva.getUtenti();
    //console.log("Utenti:", this.utenti);
    //this.isProfile = !this.route.snapshot.paramMap.get('id') ? false : true;
    //console.log("ID:", this.route.snapshot.paramMap.get('id'));
    //console.log("isProfile:", this.isProfile);
  }


}

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiceTestService } from '../direttive/service-test.service';

@Component({
  selector: 'app-contatto-singolo',
  templateUrl: './contatto-singolo.component.html',
  styleUrls: ['./contatto-singolo.component.scss']
})
export class ContattoSingoloComponent implements OnInit{

  utente: any;

  constructor(private route: ActivatedRoute, private testProva: ServiceTestService){};

  ngOnInit(): void {
    if(this.route.snapshot.paramMap.get('id')){
      this.utente = this.testProva.getUtente(parseInt(this.route.snapshot.paramMap.get('id')!))
    }
  }



}

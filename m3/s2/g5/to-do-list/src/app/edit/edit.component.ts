import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Todos } from '../Services/todos';
import { TodosService } from '../Services/todos.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.scss']
})
export class EditComponent{

  element:Todos = new Todos('', false)

  constructor(
    private todoSvc:TodosService,
    private router:ActivatedRoute,
    private location:Location){}

  ngOnInit(){
    this.router.params
    .subscribe((params:any) => {
      this.todoSvc.getElementoSingolo(params.id)
      .then(res => {
        this.element = res;
      })
    })
  }

  update(){
    this.todoSvc.updateToDo(this.element)
    .then(res => this.backToDo())
  }

  backToDo(){
    this.location.back()
  }
}

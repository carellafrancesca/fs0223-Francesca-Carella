import { Component, OnInit } from '@angular/core';
import { ITodos } from 'src/app/Iterfaces/todos';
import { TodosService } from 'src/app/Services/todos.service';
import { Todos } from 'src/app/Services/todos';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrls: ['./completed.component.scss']
})
export class CompletedComponent {

  todos:ITodos[] = [];
  loading:boolean = true;

  constructor(private todoSvc:TodosService){}

  ngOnInit(){
    this.getToDo();
  }

  getToDo(){
    this.todoSvc.getToDo().then(todosResponse =>{
      this.todos = todosResponse;
      this.loading = false;
    })
  }

}

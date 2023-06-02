import { Component, OnInit } from '@angular/core';
import { ITodos } from 'src/app/Iterfaces/todos';
import { TodosService } from 'src/app/Services/todos.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit{

  todos:ITodos[] = [];

  constructor(private todoSvc:TodosService){}

  ngOnInit(){
    this.getToDo();
  }

  /*
  deleteToDo(id?:number){
    this.todoSvc.deleteToDo(id)
    .then(res => {
      console.log('Elemento Eliminato');
      this.getToDo();
    })
  }*/

  getToDo(){
    this.todoSvc.getToDo().then(todosResponse =>{
      this.todos = todosResponse;
    })
  }
}

import { Component, OnInit } from '@angular/core';
import { ITodos } from 'src/app/Iterfaces/todos';
import { TodosService } from 'src/app/Services/todos.service';
import { Todos } from 'src/app/Services/todos';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit{

  todos:ITodos[] = [];
  loading:boolean = true;
  element:Todos = new Todos('', false)

  constructor(private todoSvc:TodosService){}

  ngOnInit(){
    this.getToDo();
  }

  deleteToDo(id?:number){
    this.todoSvc.deleteToDo(id)
    .then(res => {
      console.log('Elemento Eliminato');
      this.getToDo();
    })
  }

  create(){
    this.todoSvc.addToDo(this.element)
    .then((res) => {
      this.getToDo();
    })
  }

  completed(element:ITodos){
    if(element.completed == false){
      element.completed = true
      this.todoSvc.updateToDo(element).then(res => this.getToDo())
    }
  }

  getToDo(){
    this.todoSvc.getToDo().then(todosResponse =>{
      this.todos = todosResponse;
      this.loading = false;
    })
  }
}

import { ITodos } from './../Iterfaces/todos';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  apiJson:string = 'http://localhost:3000/todos';

  constructor() { }

  getToDo():Promise<ITodos[]>{
    return fetch(this.apiJson).then(response => response.json());
  }

  getElementoSingolo(id:number):Promise<ITodos>{
    return fetch(this.apiJson+'/'+id).then(response => response.json());
  }

  addToDo(todos:ITodos):Promise<ITodos>{
    return fetch(this.apiJson,{
      method:'post',
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(todos)
    }).then(response => response.json());
  }

  updateToDo(todos:ITodos){
    return fetch(this.apiJson+'/'+ todos.id,{
      method:'PUT',
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(todos)
    }).then(response => response.json());
  }

  deleteToDo(id:number = 0){
    return fetch(this.apiJson+'/'+ id,{
      method:'DELETE',
    }).then(response => response.json());
  }

}

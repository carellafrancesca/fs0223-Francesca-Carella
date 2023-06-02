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

  addToDo(todos:ITodos):Promise<ITodos>{
    return fetch(this.apiJson,{
      method:'post',
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(todos)
    }).then(response => response.json());
  }



}

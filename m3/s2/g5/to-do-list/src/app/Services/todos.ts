import { ITodos } from "../Iterfaces/todos";

export class Todos implements ITodos{
    id?:number;
    title:string;
    completed:boolean;

    constructor(title:string, completed:boolean, id?:number){
      this.id = id;
      this.title = title;
      this.completed = completed;
    }
}

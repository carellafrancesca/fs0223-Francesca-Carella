export class User{
    name:string;
    lastname:string;
    id:number;

    constructor(name:string, lastname:string, id:number){
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

}

//nel eventuale file ts dove l'elemento viene importato: import { User } from './modules/user.js (dopo './' inserire la cartella e il file in js)
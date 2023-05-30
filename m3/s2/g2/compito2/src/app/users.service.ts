import { Injectable } from '@angular/core';
import { User } from './models/user';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  apiJson:string = "assest/db.json"

  allUsers:User[] = [];

  constructor() {
    this.getAllUsers()
  }

  getAllUsers():Promise<UsersService[]>{
    return fetch(this.apiJson).then(res => res.json())
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment.development';
import { IBook } from './ibooks';

@Injectable({
  providedIn: 'root'
})

export class BooksService {

  apiUrl = environment.apiBooks

  constructor(
    private http:HttpClient
  ) { }

  getAll(){
    return this.http.get<IBook[]>(this.apiUrl);
  }

  getById(id:number){
    return this.http.get<IBook[]>(`${this.apiUrl}/${id}`);
  }

  post(data:Partial<IBook[]>){
    return this.http.post<IBook[]>(`${this.apiUrl}`,data);
  }

  put(data:Partial<IBook[]>){
    return this.http.put<IBook[]>(`${this.apiUrl}/${data.id}`,data);
  }

  delete(id:number){
    return this.http.delete<IBook[]>(`${this.apiUrl}/${id}`);
  }

}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Photos } from '../model/photos';

@Injectable({
  providedIn: 'root'
})
export class PhotosService {

  apiUrl:string = 'https://jsonplaceholder.typicode.com/photos'
  //private likedPhoto: number[] = [];

  constructor(private http: HttpClient) {}

  getPhotos(){
    return this.http.get<Photos[]>(this.apiUrl);
  }

  deletePhotos(id:number){
    return this.http.delete(this.apiUrl + '/' + id);
  }

  /*likePhoto(id:number){
    if (!this.likedPhoto.includes(id)){
      this.likedPhoto.push(id);
    }
  }*/
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Photos } from '../model/photos';

@Injectable({
  providedIn: 'root'
})
export class PhotosService {

  apiUrl:string = 'https://jsonplaceholder.typicode.com/photos'

  constructor(private http: HttpClient) {}

  getPhotos(){
    return this.http.get<Photos[]>(this.apiUrl).pipe(map(p => {}));
  }

  post(photo:Photos){
    return this.http.post<Photos>(this.apiUrl,photo)
  }

  put(photo:Photos){
    return this.http.put<Photos>(this.apiUrl + '/', photo)
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

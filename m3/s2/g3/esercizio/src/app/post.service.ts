import { Injectable } from '@angular/core';
import { Post } from './Models/post';

@Injectable({
  providedIn: 'root'
})

export class PostService {

  postservice:Post[] = [

    {
      "id":1,
      "title":"Lorem ipsum1",
      "active":true,
      "type":"news"
    },
    {
      "id":2,
      "title":"Lorem ipsum2",
      "active":false,
      "type":"news"
    },
    {
      "id":3,
      "title":"Lorem ipsum3",
      "active":false,
      "type":"news"
    },
    {
      "id":4,
      "title":"Lorem ipsum4",
      "active":true,
      "type":"news"
    }

  ]

  getPost():Post[]{
    return this.postservice
  }

}

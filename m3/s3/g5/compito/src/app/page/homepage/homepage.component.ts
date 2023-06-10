import { Component } from '@angular/core';
import { IBook } from './ibooks';
import { BooksService } from './books.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent {

  booksArr:IBook[] = [];

  newBook:Partial<IBook> = {
    titolo:'',
    prezzo:0
  }

  constructor(private bookSvc:BooksService){}

  ngOnInit(){
    this.bookSvc.getAll().subscribe((books)=>{
      this.booksArr = books;
    })
  }

  create(){
    this.bookSvc.post(this.newBook)
    .subscribe(data=>{
      this.booksArr.push(data)
    })
  }

  delete(id:number){
    this.bookSvc.delete(id)
    .subscribe(data=>{
      let index = this.booksArr.findIndex(b => b.id == id)
      this.booksArr.splice(index,1)
    })
  }

}


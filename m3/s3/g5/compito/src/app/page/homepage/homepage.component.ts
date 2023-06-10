import { Component } from '@angular/core';
import { IBook } from './ibooks';
import { BooksService } from './books.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent {

  pizze:IBook[] = [];

  newBook:Partial<IBook> = {
    titolo:'',
    prezzo:0
  }

  constructor(private bookSvc:BooksService){}

  ngOnInit(){
    this.bookSvc.getAll().subscribe((pizze)=>{
      this.pizze = pizze;
    })
  }

  create(){
    this.bookSvc.post(this.newBook)
    .subscribe(data=>{
      this.pizze.push(data)
    })
  }

  delete(id:number){
    this.bookSvc.delete(id)
    .subscribe(data=>{
      let index = this.book.findIndex(b => b.id == id)
      this.pizze.splice(index,1)
    })
  }

}

}

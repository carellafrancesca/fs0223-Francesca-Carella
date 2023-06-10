import { Component } from '@angular/core';
import { IBook } from '../ibooks';
import { BooksService } from '../books.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.scss']
})
export class EditBookComponent {

  pizza:Partial<IBook> = {
    titolo:'',
    prezzo:0
  }

  constructor(
    private bookSvc:BooksService,
    private router:Router,
    private route:ActivatedRoute
    ){}

  ngOnInit(){

    this.route.params
    .subscribe((params:any)=>{

      this.bookSvc.getById(params.id).subscribe((book)=>{
          this.book = book
      })
    })
  }

  edit(){
    this.bookSvc.put(this.book)
    .subscribe((book)=>{
      this.router.navigate(['/homepage'])
    })
  }

}

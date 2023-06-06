import { Component } from '@angular/core';
import { Photos } from './model/photos';
import { PhotosService } from './services/photos.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'esercizio1';

  constructor(private photosSvc:Photos){}

  photoArr:Photos[] = [];

  ngOnInit(): void {
    this.photosSvc.getPhotos().subscribe(res => {
      this.photoArr = res;
    })
  }

}

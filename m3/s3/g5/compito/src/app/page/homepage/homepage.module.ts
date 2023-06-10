import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomepageComponent } from './homepage.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { HomepageRoutingModule } from './homepage-routing.module';

@NgModule({
  declarations: [
    HomepageComponent,
    EditBookComponent
  ],
  imports: [
    CommonModule,
    HomepageRoutingModule,
    FormsModule
  ]
})

export class HomepageModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodosComponent } from './Models/todos/todos.component';
import { ElementsComponent } from './elements/elements.component';
import { PagesComponent } from './pages/pages.component';
import { NavbarComponent } from './elements/navbar/navbar.component';
import { TodoComponent } from './pages/todo/todo.component';
import { CompletedComponent } from './pages/completed/completed.component';
import { HomepageComponent } from './elements/homepage/homepage.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    TodosComponent,
    ElementsComponent,
    PagesComponent,
    NavbarComponent,
    TodoComponent,
    CompletedComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PostAttiviComponent } from './post-attivi/post-attivi.component';
import { PostInattiviComponent } from './post-inattivi/post-inattivi.component';

const routes: Routes = [
  {
    path:"",
    component: HomeComponent
  },
  {
    path:"",
    component: PostAttiviComponent
  },
  {
    path:"",
    component: PostInattiviComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

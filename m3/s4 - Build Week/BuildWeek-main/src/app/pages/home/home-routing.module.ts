import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'add', loadChildren: () => import('./add/add.module').then(m => m.AddModule) },
  { path: 'edit/:id', loadChildren: () => import('./edit/edit.module').then(m => m.EditModule) },
  { path: 'singleAccomodation/:id', loadChildren: () => import('./single-accomodation/single-accomodation.module').then(m => m.SingleAccomodationModule) }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }

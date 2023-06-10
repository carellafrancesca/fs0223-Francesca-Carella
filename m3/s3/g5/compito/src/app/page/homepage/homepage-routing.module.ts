import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage.component';
import { EditBookComponent } from './edit-book/edit-book.component';


const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'edit/:id', component: EditBookComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomepageRoutingModule { }

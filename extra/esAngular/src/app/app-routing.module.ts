import { ElementiComponent } from './elementi/elementi.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProvaComponent } from './prova/prova.component';
import { TestComponent } from './test/test.component';
import { ContattoSingoloComponent } from './contatto-singolo/contatto-singolo.component';

const routes: Routes = [
  { path: '', component:ProvaComponent},
  { path: 'Elementi', component:ElementiComponent},
  { path: 'Test', component:TestComponent, children: [
    { path: ':id', component:ContattoSingoloComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
